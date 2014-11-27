package battleship.model.atributosDeJogo;

import battleship.controller.BattleshipException;
import battleship.model.QtdEmbarcacoes;
import battleship.model.elementos.Celula;
import battleship.model.elementos.Tabuleiro;

public interface ModoDeJogo {
    public void setMunicao(int qtdBombasSinalizadoras, int qtdBombasExplosivas);
    public void comecarTurno (Tabuleiro tabuleiro, int quantidade) throws BattleshipException;
}
