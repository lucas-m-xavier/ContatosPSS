package ufes.contatos;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ufes.contatos.business.command.Receptor;
import ufes.contatos.business.command.VerificaEstadoContato;
import ufes.contatos.model.Contato;
import ufes.contatos.repository.ContatoRepository;

@SpringBootApplication
public class ContatosApplication {

    public static void main(String[] args) {
        SpringApplication.run(ContatosApplication.class, args);
    }

    @Bean
    CommandLineRunner init(ContatoRepository contatoRepository) {
        return args -> {

            Receptor receptor = new Receptor(contatoRepository);
            VerificaEstadoContato verificaEstadoContato = new VerificaEstadoContato(receptor);

            contatoRepository.save(new Contato("Lucas", "(33)99912-3213", verificaEstadoContato));
            contatoRepository.save(new Contato("Gabriel", "(28)98412-3456", verificaEstadoContato));
            contatoRepository.save(new Contato("Astolfo", "(27)99933-4321", verificaEstadoContato));
            contatoRepository.save(new Contato("Josefino", "(12)91111-1111", verificaEstadoContato));
            contatoRepository.save(new Contato("Felipe", "(33)99912-3213", verificaEstadoContato));

        };
    }
}
