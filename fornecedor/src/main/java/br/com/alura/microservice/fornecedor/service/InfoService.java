package br.com.alura.microservice.fornecedor.service;

import br.com.alura.microservice.fornecedor.controller.InfoController;
import br.com.alura.microservice.fornecedor.model.InfoFornecedor;
import br.com.alura.microservice.fornecedor.repository.InfoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InfoService {

    private static final Logger LOG = LoggerFactory.getLogger(InfoService.class);


    @Autowired
    private InfoRepository infoRepository;

    public InfoFornecedor getInfoPorEstado(String estado) {
        LOG.info("informações buscadas");
        return infoRepository.findByEstado(estado);
    }
}
