package br.edu.ifspcjo.ads.web2.escalareuniao.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import br.edu.ifspcjo.ads.web2.escalareuniao.domain.model.ReuniaoFamiliar;
import br.edu.ifspcjo.ads.web2.escalareuniao.repository.ReuniaoFamiliarRepository;
import jakarta.validation.Valid;

@Service
public class ReuniaoFamiliarService {

    @Autowired
    private ReuniaoFamiliarRepository reuniaoFamiliarRepository;

    public ReuniaoFamiliar save(@Valid ReuniaoFamiliar reuniao) {
        return reuniaoFamiliarRepository.save(reuniao);
    }

    public ReuniaoFamiliar update(Long id, @Valid ReuniaoFamiliar reuniao) {
        ReuniaoFamiliar reuniaoSaved = findById(id);
        BeanUtils.copyProperties(reuniao, reuniaoSaved, "id");
        return reuniaoFamiliarRepository.save(reuniaoSaved);
    }

    public void delete(Long id) {
        reuniaoFamiliarRepository.deleteById(id);
    }

    public ReuniaoFamiliar findById(Long id) {
        return reuniaoFamiliarRepository.findById(id)
                .orElseThrow(() -> new EmptyResultDataAccessException(1));
    }
}
