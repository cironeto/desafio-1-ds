package dev.cironeto.desafio1ds.service;

import dev.cironeto.desafio1ds.dto.ClientDto;
import dev.cironeto.desafio1ds.entity.Client;
import dev.cironeto.desafio1ds.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;


    @Transactional(readOnly = true)
    public Page<ClientDto> findAllPaged(PageRequest pageRequest){
        Page<Client> list = clientRepository.findAll(pageRequest);
        return list.map(ClientDto::new);
    }

    @Transactional(readOnly = true)
    public ClientDto findById(Long id) {
        Optional<Client> obj = clientRepository.findById(id);
        Client entity = obj.orElseThrow();
        return new ClientDto(entity);
    }

    @Transactional
    public ClientDto save(ClientDto dto){
        Client entity = new Client();
        copyDtoToEntity(dto, entity);
        entity = clientRepository.save(entity);
        return new ClientDto(entity);
    }







    private void copyDtoToEntity(ClientDto dto, Client entity){
        entity.setName(dto.getName());
        entity.setCpf(dto.getCpf());
        entity.setIncome(dto.getIncome());
        entity.setBirthDate(dto.getBirthDate());
        entity.setChildren(dto.getChildren());
    }
}
