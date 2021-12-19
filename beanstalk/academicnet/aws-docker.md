# Instalando a aplicação na AWS

### Documentos do Beanstalk  

https://aws.amazon.com/pt/elasticbeanstalk/?nc1=h_ls
https://docs.aws.amazon.com/pt_br/elasticbeanstalk/latest/dg/awseb-dg.pdf

### Elastic Beanstalk CLI

https://docs.aws.amazon.com/pt_br/elasticbeanstalk/latest/dg/eb-cli3-install.html#eb-cli3-install.scripts

### Criando o ambiente:

```eb init```

```eb create env-dev --database --database.engine mysql -db.user ebroot -db.pass Passw0rd01```

### Criando a aplicação

Habilitando o profile específico

```
eb setenv SPRING_PROFILES_ACTIVE=beanstalk
```

Realizando o deploy
```eb deploy```


