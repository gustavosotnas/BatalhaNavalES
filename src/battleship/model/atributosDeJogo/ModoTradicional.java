package battleship.model.atributosDeJogo;

import battleship.controller.BattleshipException;
import battleship.controller.Posicao;
import battleship.model.elementos.Tabuleiro;
import battleship.view.BattleshipGameUI;

public class ModoTradicional implements ModoDeJogo {

    @Override
    public void setMunicaoInicial() {
        //faça nada
    }

    public void comecarTurno(Tabuleiro tabuleiro, int quantidade) throws BattleshipException {

        while (quantidade == 0) {
            System.out.println("Vez do jogador 1...");
            BattleshipGameUI.exibeTabuleiro(tabuleiro);
            Posicao posicao = BattleshipGameUI.menuDetonaBomba();
            // funcao de ataque a celula;
            // função que verifica se foi atingido;
            //if(verifica ==  true){
            //}
        }
    }

}
