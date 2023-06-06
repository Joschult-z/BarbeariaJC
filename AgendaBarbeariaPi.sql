create schema agenda;
use agenda;

CREATE TABLE IF NOT EXISTS `agenda`.`clientes`(
`idcliente` INT NOT NULL AUTO_INCREMENT,
`nomeCliente` VARCHAR(45) NOT NULL,
`cpf` VARCHAR(14),
 `telefone` VARCHAR(14),
PRIMARY KEY (`idcliente`),
UNIQUE INDEX `cpf_UNIQUE` (`cpf` ASC) )
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `agenda`.`barbeiros`(
`idcbarbeiro` INT NOT NULL AUTO_INCREMENT,
`nomeBarbeiro` VARCHAR(45) NOT NULL,
`cpf` VARCHAR(14),
 `telefone` VARCHAR(14),
PRIMARY KEY (`idbarbeiro`),
UNIQUE INDEX `cpf_UNIQUE` (`cpf` ASC) )
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `agenda`.`servicos`(
`idservicos` INT NOT NULL AUTO_INCREMENT,
`nomeServico` VARCHAR(45) NOT NULL,
`preco` float,
 `telefone` VARCHAR(14),
PRIMARY KEY (`idcliente`),
UNIQUE INDEX `cpf_UNIQUE` (`cpf` ASC))
ENGINE = InnoDB;

