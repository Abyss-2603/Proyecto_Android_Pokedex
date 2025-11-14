package es.iesagora.generador_de_cartas.repository;

import java.util.ArrayList;
import java.util.List;

import es.iesagora.generador_de_cartas.R;
import es.iesagora.generador_de_cartas.model.Pokemon;

public class PokemonRepository {


    private static List<Pokemon> listaPokemons;

    public PokemonRepository() {
        listaPokemons = new ArrayList<>();

        //1 Generacion
        listaPokemons.add(new Pokemon(151,"Mew", R.drawable.mew, "Si se observa a través de un microscopio, puede distinguirse cuán corto, fino y delicado es el pelaje de este Pokémon.", 1));
        listaPokemons.add(new Pokemon(150,"Mewtwo", R.drawable.mewtwo, "Su ADN es casi el mismo que el de Mew. Sin embargo, su tamaño y carácter son muy diferentes.", 1));
        listaPokemons.add(new Pokemon(25,"Pikachu", R.drawable.pikachu, "Cuando se enfada, este Pokémon descarga la energía que almacena en el interior de las bolsas de las mejillas.", 1));
        listaPokemons.add(new Pokemon(9,"Blastoise", R.drawable.blastoise, "Aumenta de peso deliberadamente para contrarrestar la fuerza de los chorros de agua que dispara.", 1));
        listaPokemons.add(new Pokemon(1,"Bulbasaur", R.drawable.bulbasaur, "Tras nacer, crece alimentándose durante un tiempo de los nutrientes que contiene el bulbo de su lomo.", 1));
        listaPokemons.add(new Pokemon(6,"Charizard", R.drawable.charizard, "Cuando se enfurece de verdad, la llama de la punta de su cola se vuelve de color azul claro.", 1));
        listaPokemons.add(new Pokemon(4,"Charmander", R.drawable.charmander, "La llama de su cola indica su fuerza vital. Si está débil, la llama arderá más tenue.", 1));
        listaPokemons.add(new Pokemon(5,"Charmeleon", R.drawable.charmeleon, "Al agitar su ardiente cola, eleva poco a poco la temperatura a su alrededor para sofocar a sus rivales.", 1));
        listaPokemons.add(new Pokemon(2,"Ivysaur", R.drawable.ivysaur, "Cuanta más luz solar recibe, más aumenta su fuerza y más se desarrolla el capullo que tiene en el lomo.", 1));
        listaPokemons.add(new Pokemon(26,"Raichu", R.drawable.raichu, "Su cola actúa como toma de tierra y descarga electricidad al suelo, lo que le protege de los calambrazos.", 1));
        listaPokemons.add(new Pokemon(7,"Squirtle", R.drawable.squirtle, "Tras nacer, se le hincha el lomo y se le forma un caparazón. Escupe poderosa espuma por la boca.", 1));
        listaPokemons.add(new Pokemon(3,"Venusaur", R.drawable.venusaur, "Puede convertir la luz del sol en energía. Por esa razón, es más poderoso en verano.", 1));
        listaPokemons.add(new Pokemon(8,"Wartortle", R.drawable.wartortle, "Tiene una cola larga y peluda que simboliza la longevidad y lo hace popular entre los mayores.", 1));

        //2 Generacion
        listaPokemons.add(new Pokemon(155,"Cyndaquil", R.drawable.cyndaquil, "La llama que tiene en la espalda arde cuando está enfadado. Si está cansado, apenas echa fuego por la espalda.", 2));
        listaPokemons.add(new Pokemon(156,"Quilava", R.drawable.quilava, "Su pelaje es a prueba de fuego. Puede resistir cualquier ataque ígneo. Antes de entrar en combate, le da la espalda al rival para alardear del fuego de su lomo.", 2));
        listaPokemons.add(new Pokemon(157,"Typhlosion", R.drawable.typhlosion, "Se oculta tras un brillante resplandor cuando prepara su ataque. Crea explosiones de fuego que lo rodean y lo protegen.", 2));
        listaPokemons.add(new Pokemon(158,"Totodile", R.drawable.totodile, "Es de naturaleza violenta y le clava los dientes a todo lo que se mueve. Conviene no darle la espalda.", 2));
        listaPokemons.add(new Pokemon(159,"Croconaw", R.drawable.croconaw, "Si se le rompen los colmillos, le vuelven a crecer rápidamente. Sus mandíbulas son tan poderosas que no suelta a su presa fácilmente.", 2));
        listaPokemons.add(new Pokemon(160,"Feraligatr", R.drawable.feraligatr, "Aunque es grande, es muy rápido. Cuando cierra sus mandíbulas, es capaz de destrozar cualquier cosa con sus potentes fauces.", 2));
        listaPokemons.add(new Pokemon(152,"Chikorita", R.drawable.chikorita, "Al luchar, agita la hoja que tiene para mantener a raya al enemigo. Su aroma tiene un efecto calmante en los rivales.", 2));
        listaPokemons.add(new Pokemon(153,"Bayleef", R.drawable.bayleef, "El collar que rodea su cuello desprende un aroma muy estimulante que da energía a quienes lo huelen.", 2));
        listaPokemons.add(new Pokemon(154,"Meganium", R.drawable.meganium, "El aliento de Meganium tiene el poder de revivir las plantas marchitas. Estar cerca de él produce una sensación de paz y bienestar.", 2));
        listaPokemons.add(new Pokemon(162,"Furret", R.drawable.furret, "Es muy ágil y tiene un cuerpo delgado y flexible. Aunque lo atrapen, se escabullirá fácilmente. Cría a sus retoños en madrigueras largas y estrechas.", 2));
        listaPokemons.add(new Pokemon(249,"Lugia", R.drawable.lugia, "Duerme en el fondo del mar para evitar provocar tormentas con los batidos de sus enormes alas. Es capaz de calmar tormentas.", 2));
        listaPokemons.add(new Pokemon(250,"Ho-Oh", R.drawable.ho_oh, "Se dice que las plumas de Ho-Oh brillan con los siete colores del arcoíris. Se cree que trae alegría a quien las vea.", 2));
        listaPokemons.add(new Pokemon(251,"Celebi", R.drawable.celebi, "Viaja a través del tiempo. Dicen que mientras Celebi aparezca, el futuro será brillante y lleno de esperanza.", 2));

        //3 Generacion

        listaPokemons.add(new Pokemon(252,"Treecko", R.drawable.treecko, "Tiene unas ventosas en los dedos que le permiten trepar por paredes y techos. Su carácter es tranquilo, pero no duda en plantar cara a enemigos más grandes.", 3));
        listaPokemons.add(new Pokemon(253,"Grovyle", R.drawable.grovyle, "Vive en lo alto de los árboles. Usa las hojas afiladas de sus brazos para atacar a sus enemigos con agilidad.", 3));
        listaPokemons.add(new Pokemon(254, "Sceptile", R.drawable.sceptile, "En la selva se mueve con agilidad entre los árboles. Las hojas de sus brazos son tan afiladas que pueden cortar gruesos troncos.", 3));
        listaPokemons.add(new Pokemon(255,"Torchic", R.drawable.torchic, "Este Pokémon almacena el fuego en su cuerpo y lanza bolas de fuego que alcanzan hasta mil grados de temperatura.", 3));
        listaPokemons.add(new Pokemon(256,"Combusken", R.drawable.combusken, "Su poderoso tren inferior le permite asestar más de diez patadas por segundo. Emite fuertes gritos para intimidar al enemigo.", 3));
        listaPokemons.add(new Pokemon(257,"Blaziken", R.drawable.blaziken, "Cuando combate, las llamas que le envuelven los puños arden con más fuerza. Cuanto más duro es el combate, más intensas son las llamas.", 3));
        listaPokemons.add(new Pokemon(258,"Mudkip", R.drawable.mudkip, "La aleta de su cabeza actúa como un radar muy sensible. Vive en la orilla y usa sus fuertes patas traseras para cavar en el barro.", 3));
        listaPokemons.add(new Pokemon(259,"Marshtomp", R.drawable.marshtomp, "Su cuerpo viscoso le permite vivir en el agua y en la tierra. Puede caminar sin problemas incluso en el fango más profundo.", 3));
        listaPokemons.add(new Pokemon(260,"Swampert", R.drawable.swampert, "Puede arrastrar fácilmente rocas que pesan más de una tonelada. Detecta los cambios del tiempo con sus aletas y se prepara para las tormentas.", 3));
        listaPokemons.add(new Pokemon(280,"Ralts", R.drawable.ralts, "Siente las emociones de las personas. Si percibe hostilidad, se esconde, y si siente alegría, se acerca para compartirla.", 3));
        listaPokemons.add(new Pokemon(281,"Kirlia", R.drawable.kirlia, "Usa sus poderes psíquicos para crear ilusiones y protegerse. Se dice que bailar llena su corazón de energía positiva.", 3));
        listaPokemons.add(new Pokemon(282,"Gardevoir", R.drawable.gardevoir, "Es capaz de distorsionar las dimensiones para proteger a su Entrenador. Su devoción es tan grande que se arriesgaría a todo por él.", 3));
        listaPokemons.add(new Pokemon(384,"Rayquaza", R.drawable.rayquaza, "Vive en la capa de ozono desde hace millones de años. Dicen que desciende a la tierra solo para calmar los combates entre Groudon y Kyogre.", 3));

    }

    public List<Pokemon> getListaPokemons(){
        return listaPokemons;
    }

    public List<Pokemon> getPokemonsByGeneration(int gen) {
        List<Pokemon> result = new ArrayList<>();

        for (Pokemon p : listaPokemons) {
            if (p.getGeneracion() == gen) {
                result.add(p);
            }
        }

        return result;
    }



}
