package br.com.alura.componentes;

public record Moeda(String base_code, String target_code, Double conversion_rate, Double conversion_result) {
    //Personalizando resposta recebida para o cliente junto aos dados que desejamos mostrar
    @Override
    public String toString(){
        return "O valor de 1 " + base_code + " em " + target_code + " é de: " + conversion_rate +
                ". Já o valor da quantidade desejada é de: " + conversion_result;
    }
}
