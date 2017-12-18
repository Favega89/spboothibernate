package com.project.project.Controller;

import com.project.project.Entities.Client;
import com.project.project.Service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.print.attribute.standard.Media;
import java.util.List;

/**
 * Created by idra on 13/12/2017.
 */
@RestController
@RequestMapping("/clients")
@CrossOrigin
public class ClientController {

    @Autowired
    private ClientService clientService;

    @RequestMapping("/")
    public String HelloWorld(){
        return "Hello Clients";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET,consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Client> getClientById(@PathVariable("id") Integer id){
        Client client = clientService.getById(id);
        return new ResponseEntity<Client>(client, HttpStatus.OK);
    }

    /*VER MEDYA TYPE APPLICATION.JSON (ACEPTA JSON , EL DE AHORA ACEPTA STRING)*/
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public ResponseEntity<List<Client>> getAllClients(){
        List<Client> clients = clientService.getAll();
        return new ResponseEntity<List<Client>>(clients,HttpStatus.OK);
    }

    @RequestMapping(value = "/{name}",method = RequestMethod.GET,consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Client>> getByName(@PathVariable("name") String name){
        List<Client> clients = clientService.getByString(name);
        return new ResponseEntity<List<Client>>(clients,HttpStatus.OK);
    }
    @RequestMapping(value = "/add",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> addClient(@RequestBody Client client){
        clientService.add(client);
        return new ResponseEntity<Void>(HttpStatus.CREATED);
    }

    @RequestMapping(value = "/edit/{id}",method = RequestMethod.GET,consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Client> updateClient(@RequestBody Client client){
        clientService.update(client);
        return new ResponseEntity<Client>(client,HttpStatus.OK);
    }

}
