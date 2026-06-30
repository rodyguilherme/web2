package br.edu.ifspcjo.ads.web2.escalareuniao.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.edu.ifspcjo.ads.web2.escalareuniao.domain.model.ReuniaoFamiliar;
import br.edu.ifspcjo.ads.web2.escalareuniao.repository.ReuniaoFamiliarRepository;
import br.edu.ifspcjo.ads.web2.escalareuniao.service.ReuniaoFamiliarService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/reunioes-familiares")
public class ReuniaoFamiliarResource {

    @Autowired
    private ReuniaoFamiliarRepository reuniaoFamiliarRepository;

    @Autowired
    private ReuniaoFamiliarService reuniaoFamiliarService;

    @GetMapping
    public List<ReuniaoFamiliar> list() {
        return reuniaoFamiliarRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ReuniaoFamiliar> findById(@PathVariable Long id) {
        Optional<ReuniaoFamiliar> reuniao = reuniaoFamiliarRepository.findById(id);
        return reuniao.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ReuniaoFamiliar create(@Valid @RequestBody ReuniaoFamiliar reuniao) {
        return reuniaoFamiliarService.save(reuniao);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ReuniaoFamiliar> update(@PathVariable Long id, @Valid @RequestBody ReuniaoFamiliar reuniao) {
        ReuniaoFamiliar reuniaoSaved = reuniaoFamiliarService.update(id, reuniao);
        return ResponseEntity.ok(reuniaoSaved);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void remove(@PathVariable Long id) {
        reuniaoFamiliarService.delete(id);
    }
}
