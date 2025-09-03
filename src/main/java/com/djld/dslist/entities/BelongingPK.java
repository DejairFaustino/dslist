package com.djld.dslist.entities;


import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable//informa p/ o framework que este tipo (BelongingPK) representando dois campos (game_id e list_id) quando este tipo for instanciado na tabela relacional. (Encapsulando dois atributos em uma única classe)
public class BelongingPK {

    @ManyToOne // Mapeia o campos como chave estrangeira na tabela.
    @JoinColumn(name = "game_id") // definindo que se trata de uma chave estrangeira, da tabela Game, dentro da tabela Belonging indicando 'um para muitos'
    private Game game;

    @ManyToOne // Mapeia o campos como chave estrangeira na tabela.
    @JoinColumn(name = "list_id") // definindo que se trata de uma chave estrangeira, da tabela GameList, dentro da tabela Belonging indicando 'um para muitos'
    private GameList list;

    public BelongingPK() {
    }

    public BelongingPK(Game game, GameList list) {
        this.game = game;
        this.list = list;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public GameList getList() {
        return list;
    }

    public void setList(GameList list) {
        this.list = list;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((game == null) ? 0 : game.hashCode());
        result = prime * result + ((list == null) ? 0 : list.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        BelongingPK other = (BelongingPK) obj;
        if (game == null) {
            if (other.game != null)
                return false;
        } else if (!game.equals(other.game))
            return false;
        if (list == null) {
            if (other.list != null)
                return false;
        } else if (!list.equals(other.list))
            return false;
        return true;
    }

    
}
