package com.estudos.albumdefigurinhas;

import com.estudos.albumdefigurinhas.entity.Jogador;
import com.estudos.albumdefigurinhas.entity.PosicaoJogador;
import com.estudos.albumdefigurinhas.entity.Time;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;


@RunWith(SpringRunner.class)
public class AlbumDeFigurinhasApplicationTests {



	@Test
	public void ObterElencoDeUmTime(){
		Time time = new Time();

		time.setNome("Brasil");
		time.setDataFundacao(Calendar.getInstance());
		time.setApelido("BRA");

		List<Jogador> elenco = new ArrayList<>();

		Jogador neymar = new Jogador();
		neymar.setNome("Neymar JR");
		neymar.setNacionalidade("Brasil");
		neymar.setApelido("Ney");
		neymar.setPosicao(PosicaoJogador.ATA);

		Jogador antony = new Jogador();
		antony.setNome("Antony");
		antony.setNacionalidade("Brasil");
		antony.setApelido("Cria");
		antony.setPosicao(PosicaoJogador.ATA);

		Jogador alisson = new Jogador();
		alisson.setNome("Alisson");
		alisson.setNacionalidade("Brasil");
		alisson.setPosicao(PosicaoJogador.GOL);

		Jogador thiago = new Jogador();
		thiago.setNome("Thiago Silva");
		thiago.setNacionalidade("Brasil");
		thiago.setPosicao(PosicaoJogador.ZAG);

		elenco.addAll(Arrays.asList(neymar,antony,alisson,thiago));

		Assertions.assertEquals(4,elenco.size());
		Assertions.assertEquals("Alisson",elenco.get(2).getNome());
		Assertions.assertEquals(PosicaoJogador.GOL,elenco.get(2).getPosicao());
	}

}
