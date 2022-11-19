package EsAlunni;

public class Rossella_ContoCorrente {
    private String proprietario;
    private String numero_conto;
    public double saldo_iniziale;
    public int movimenti=0;
    private String[] lista = new String[5];

    Rossella_ContoCorrente(String proprietario,String numero_conto,double saldo_attuale){
        this.proprietario= proprietario;
        this.numero_conto=numero_conto;
        this.saldo_iniziale=saldo_attuale;
    }
    public void versamento(double soldi_versati){
        saldo_iniziale += soldi_versati;
        System.out.println("Hai versato "+ soldi_versati);
        System.out.println("il saldo iniziale"+ saldo_iniziale);
        lista_movimenti(movimenti);
        movimenti +=1;

    }
    public void prelievo(double soldi_versati){
        if(saldo_iniziale>soldi_versati) {
            saldo_iniziale -= soldi_versati;
            System.out.println("Hai prelevato "+ soldi_versati);
            System.out.println("Ora hai un saldo di "+ saldo_iniziale);
            lista_movimenti(movimenti);
            movimenti++;
        }else{
            System.out.println("Oerazione non consentita!");
        }
    }
    public void saldo(){
        System.out.println("il saldo è:" + saldo_iniziale);
        lista_movimenti(movimenti);
        movimenti++;
    }
    public void testSaldo(){
        System.out.println(saldo_iniziale);
    }
    public void infoConto(){
        System.out.println("Il proprietario è il Sig. " + proprietario + "\n con numero conto N." + numero_conto);
        lista_movimenti(movimenti);
        movimenti++;
    }
    public void lista_movimenti(int movimenti){
        if (movimenti < 5) {
            lista[movimenti] = "E'stata fatto il movimento";
        } else if (movimenti == 5) {
            for (int i = 0; i < 5; i++) {
                lista[i] = lista[i + 1];
            }
        }
        for(int i=0;i<movimenti;i++ ) {
            System.out.println("La lista movimenti è " + lista[i]);
        }
    }
}

