# ADR 001: Chunk-Oriented Processing vs. In-Memory Collection

## Contexto
Necessidade de ingestão de lotes de liquidação com 1.000.000 de linhas sob teto estrito de 512MB de memória Heap JVM (-Xmx512m).

## Decisão
Utilizar o modelo Chunk-Oriented Processing do Spring Batch em chunks de 1.000 registros, via streams de I/O em janelas delimitadas.

## Consequências
- Consumo de memória estável O(1).
- Objetos liberados para coleta do Garbage Collector a cada chunk concluído, eliminando risco de OutOfMemoryError.
