
## mundo-hoje WEB scraping

#### To access Swagger API documentation **[`CLICK HERE`](https://mundo-hoje-web-scraping.up.railway.app/swagger-ui.html)**

---
### Technologies used in development
 - Spring boot 
 - Spring Security
 - Lombok
 - Jsoup
 ---
### Motivation
 - This project was created to solve the need for the mobile application `mundo-hoje` that consumes the IBGE news API, the mundo-hoje project can be accessed by **[`CLICKING HERE`](https://github.com/marcos-vcs/mundo-hoje)**
 - The open IBGE news API does not return the complete news, but it does return the link to the complete news.
 - I was forced to develop an application that converted the news link into a json with the information that was relevant to my needs.
 - **[`CLICK HERE`](https://servicodados.ibge.gov.br/api/docs/noticias?versao=3)** to access the official and complete documentation of the IBGE news API.
---
### Operation
 - This API has only 1 `POST` type endpoint (baseUrl/api/news/scraping-article)
 - This single endpoint receives in its body an item according to the IBGE news API.
 - Example of an item that must be passed in the request body:
 ```
 {
      "id": 35875,
      "tipo": "Notícia",
      "titulo": "Mais de 70% das empresas industriais com 100 ou mais pessoas ocupadas inovaram em 2021",
      "introducao": "Setor químico concentra a maior proporção de indústrias inovadoras - Foto: Freepik Em 2021, a taxa de inovação no Brasil foi de 70,5%, percentual relativo às empresas industriais com 100 ou mais pessoas ocupadas que lançaram um produto ou implementaram...",
      "data_publicacao": "15/12/2022 10:00:00",
      "produto_id": 35867,
      "produtos": "35867|Pesquisa de Inovação Semestral|pesquisa-de-inovacao-semestral|3065",
      "editorias": "economicas",
      "imagens": "{\"image_intro\":\"images\\/agenciadenoticias\\/estatisticas_economicas\\/2022_12\\/pintec_THUMB_freepik.jpg\",\"float_intro\":\"\",\"image_intro_alt\":\"\",\"image_intro_caption\":\"\",\"image_fulltext\":\"images\\/agenciadenoticias\\/estatisticas_economicas\\/2022_12\\/pintec_HOME_freepik.jpg\",\"float_fulltext\":\"\",\"image_fulltext_alt\":\"\",\"image_fulltext_caption\":\"\"}",
      "produtos_relacionados": "35867",
      "destaque": true,
      "link": "http://agenciadenoticias.ibge.gov.br/agencia-noticias/2012-agencia-de-noticias/noticias/35875-mais-de-70-das-empresas-industriais-com-100-ou-mais-pessoas-ocupadas-inovaram-em-2021.html"
    }
```
 - The API will then add a new attribute to that object, an object I called article.
 - Structure of an article-type object:
  ```
export class Article{
  title: string;
  subtitle: string;
  metadata: string;
  text: string;
}
```
![image](https://user-images.githubusercontent.com/37250628/207921473-3bd3a8fd-16d5-43cf-aba8-30c0f6c32bab.png)

---
#### Questions or suggestions?
Feel free to open a new issue.

----
 **Thanks for visiting this repository!:sparkling_heart:**
 
If you liked it, please leave a star.:star2:
