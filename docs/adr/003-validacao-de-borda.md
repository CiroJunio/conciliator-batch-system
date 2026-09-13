# ADR 003: Validação em Camada de Borda vs. Regra de Persistência

## Contexto
Proteção dos recursos do banco de dados e prevenção de I/O inútil em registros com formato monetário incorreto ou identificador fiscal corrompido.

## Decisão
Aplicar validação declarativa com Jakarta Validation no ItemProcessor, antes da etapa de escrita.

## Consequências
- Conexões de banco e transações de rede só são alocadas para dados já validados estruturalmente.
- Desvio desacoplado de registros inválidos para arquivos de Dead Letter sem abortar o lote íntegro.
