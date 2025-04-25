create table consertos(
    id bigint not null auto_increment,
    data_entrada varchar(10) not null,
    data_saida varchar(10) not null,
    nome varchar(50) not null,
    experiencia int not null,
    marca varchar(50) not null,
    modelo varchar(50) not null,
    ano varchar(4) not null,
    primary key(id)
)