# lambda-fallback-gerador-animal

Esta função Lambda faz parte de um **circuit breaker serverless** implementado na AWS. Ela atua como fallback para a função principal [`lambda-gerador-animal`](https://github.com/CarlosGRSchneider/lambda-gerador-animal), fornecendo uma versão simplificada para garantir a continuidade do serviço em caso de falhas.

## Descrição

A função gera combinações simples de:
- **Animal**: escolhas limitadas como "Fuinha" ou "Zebra".
- **Adjetivo**: escolhas limitadas como "honesta" ou "sincera".

Diferentemente da função principal, esta função não utiliza listas extensas ou lógica complexa, focando na simplicidade e confiabilidade.

## Exemplo de Retorno

A função retorna uma string no formato:

```
"Fuinha honesta"
```

ou

```
"Zebra sincera"
```

## Estrutura do Projeto

### Classe Principal

1. **`FallbackGerador`**
   - Contém a lógica para gerar combinações simples de animal e adjetivo.
   - Utiliza valores fixos para reduzir a possibilidade de erros.

## Relação com a Função Principal

Esta função é o fallback para a [função principal](https://github.com/CarlosGRSchneider/lambda-gerador-animal), que possui uma lógica mais avançada para gerar combinações de animais e adjetivos. Em caso de falhas na função principal, o circuit breaker redireciona as requisições para esta função.
