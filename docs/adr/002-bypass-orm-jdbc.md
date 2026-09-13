# ADR 002: Persistência via JDBC Batch Insert Nativo vs. Hibernate/JPA

## Contexto
Necessidade de alta vazão de escrita para persistência de grandes volumes contábeis sem degradação de performance ao longo do job.

## Decisão
Utilizar JdbcBatchItemWriter com SQL nativo (Spring Data JDBC), contornando o ORM (Hibernate).

## Consequências
- Eliminação do overhead do First-Level Cache (Session) do Hibernate.
- Eliminação de ciclos de CPU gastos com dirty-checking.
- Operações de escrita em lote executadas diretamente no driver via batch JDBC nativo.
