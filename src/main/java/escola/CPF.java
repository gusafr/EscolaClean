package escola;

public class CPF {

    // Value Object

    private String numero;

    public CPF(String numero) {
        if (numero == null || !numero.matches("\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}") ) {
            throw new IllegalArgumentException("CPF Invalido!");
        }
        this.numero = numero;
    }

}
