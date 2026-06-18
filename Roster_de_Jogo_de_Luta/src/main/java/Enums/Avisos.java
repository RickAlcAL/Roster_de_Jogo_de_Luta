package Enums;

public enum Avisos {
    CONFIRMADO ("Ação confirmada"),
    ERRO ("Erro....");

    private final String msgUser;


    Avisos (String msgUser){
        this.msgUser = msgUser;
    }

    public String getMsgUser() {
        return msgUser;
    }
}
