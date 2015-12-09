nfse
====

[![Build Status](https://travis-ci.org/flexait/nfse.svg?branch=master)](https://travis-ci.org/flexait/nfse)

## Api para geração de NFSe padrão Abrasf

A API está pronta para enviar lote de notas no padrão da Prefeitura de Vila Velha, mas nem todas as funcionalidades estão implementadas.

Fique à vontade para contribuir ou solicitar melhorias.

### Adicionando a dependência (versão estável)

```
<dependency>
        <groupId>br.com.flexait</groupId>
        <artifactId>nfse</artifactId>
        <version>0.1.0</version>
</dependency>
```

*Download* em https://github.com/flexait/nfse/releases/tag/nfse-0.1.0


### Adicionando a dependência (versão instável)

```
<dependency>
	<groupId>br.com.flexait</groupId>
	<artifactId>nfse</artifactId>
	<version>0.1.0</version>
</dependency>
		
```



### Exemplo de uso

```
Nfse.nfse()
	.withLoteRps(
		Nfse.loteNfse()
			.withCnpj("00000000000000")
			.withNumeroLote(123123L)
			.addRps(
				Nfse.rps()
					.withNumero(1L)
					.withInfId("d")
					.withServico(
							Nfse.servico()
							.withValorServicos(10.01657987)
							.withItemListaServico("1")
							.withExigibilidadeISS(ExigibilidadeISS.EXIGIVEL)
							.withCodigoMunicipio(123)
							.withDiscriminacao("Test")
							.build()
					)
					.withPrestador(
						Nfse.prestador()
							.withCnpj("12312312312312")
							.build()
					)
					.withTomador(
						Nfse.tomador()
							.withCpf("00000000000")
							.withEndereco(
								Nfse.endereco()
									.withEndereco("Rua")
									.withNumero(1)
									.withBairro("Bairro")
									.withCodigoMunicipio(321)
									.withUf("ES")
									.withCep("29111111")
									.build()
							).build()
					).build()
			).build()
	).asXML();

```

### Com static import para facilitar leitura

```
import static br.com.flexait.nfse.builder.Nfse.endereco;
import static br.com.flexait.nfse.builder.Nfse.loteNfse;
import static br.com.flexait.nfse.builder.Nfse.nfse;
import static br.com.flexait.nfse.builder.Nfse.prestador;
import static br.com.flexait.nfse.builder.Nfse.rps;
import static br.com.flexait.nfse.builder.Nfse.servico;
import static br.com.flexait.nfse.builder.Nfse.tomador;

...

nfse().withLoteRps(
	loteNfse()
		.withCnpj("00000000000000")
		.withNumeroLote(123123L)
		.addRps(
			rps()
				.withNumero(1L)
				.withInfId("d")
				.withServico(
					servico()
						.withValorServicos(10.016587)
						.withItemListaServico("1")
						.withExigibilidadeISS(ExigibilidadeISS.EXIGIVEL)
						.withCodigoMunicipio(123)
						.withDiscriminacao("Test")
						.build()
				)
				.withPrestador(
					prestador()
						.withCnpj("12312312312312")
						.build()
				)
				.withTomador(
					tomador()
						.withCpf("00000000000")
						.withEndereco(
							endereco()
								.withEndereco("Rua")
								.withNumero(1)
								.withBairro("Bairro")
								.withCodigoMunicipio(321)
								.withUf("ES")
								.withCep("29111111")
								.build()
						).build()
				).build()
			).build()
		).asXML();
```
