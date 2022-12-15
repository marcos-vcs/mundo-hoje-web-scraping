package br.com.mundo.hoje.models.enums;

//Base url from ibge news portal
public enum BaseUrl {
    BASE_URL("http://servicodados.ibge.gov.br/api/v3/noticias");

    private String message;

    BaseUrl(String message){
        this.message = message;
    }

    public String get(){
        return message;
    }

}
