# Scrum Board


O Board Task Management é um sistema de gerenciamento de tarefas baseado em um board customizável.
Ele permite acompanhar o fluxo das tarefas por meio de colunas, garantindo controle sobre o progresso das atividades, bloqueios e tempos de conclusão.

 ## Funcionalidades


- Criar um novo board com colunas personalizadas

- Listar e selecionar um board existente

- Excluir boards

- Criar, mover, bloquear e desbloquear cards (tarefas)

- Registrar histórico de movimentação

- Controlar tempo de conclusão das tarefas

- Cancelar tarefas em qualquer etapa

- Relatórios (Requisitos Opcionais)

- Relatório de tempo de execução das tarefas

- Relatório de bloqueios dos cards, com justificativas e tempos

  ## Tecnologias Utilizadas

- Java 17+

- Spring Boot

- Spring Data JPA

- MySQL

- Maven

 ## Estrutura do Projeto

 board-task-management/
 
├── src/main/ScrumBoard<br>
│   ├── controller/   # Controladores REST<br>
│   ├── service/      # Regras de negócio<br>
│   ├── repository/   # Persistência (JPA Repositories)<br>
│   ├── Entidades/    # Entidades do banco de dados<br>
├── src/main/resources/<br>
│   ├── application.properties  # Configuração do Banco de Dados<br>
├── pom.xml  # Configuração do Maven<br>
├── README.md  # Documentação do Projeto<br>
