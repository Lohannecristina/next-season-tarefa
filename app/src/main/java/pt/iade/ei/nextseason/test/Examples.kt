package pt.iade.ei.nextseason.test

import pt.iade.ei.nextseason.models.ContentItem
import pt.iade.ei.nextseason.models.Review
import pt.iade.ei.nextseason.models.User
import java.time.LocalDate
import java.time.LocalDateTime

fun contentItemListExample(): List<ContentItem> {
    return listOf(
        ContentItem(
            id = 1,
            title = "Donnie Darko",
            description = "Quem vê Donnie Darko logo imagina se tratar de um adolescente desajustado. Na verdade, Donnie está à beira da loucura, devido a visões constantes de um coelho monstruoso, que tenta mantê-lo sob a sua sinistra influência. Incitado pela aparição, Donnie tem atuação antissocial, enquanto se submete à terapia, sobrevive às extravagâncias da vida e do romance no colégio e, por acaso, escapa a uma estranha morte devido à queda de um avião. Donnie luta contra os seus demônios, literal e figurativamente, numa intriga de histórias entrelaçadas que jogam com as viagens no tempo, gurus fundamentalistas, predestinação e os desígnios do universo.",
            banner = "https://image.tmdb.org/t/p/original/yPtjm9QVsXLMsrYFEFZGzdXqsbz.jpg",
            cover = "https://image.tmdb.org/t/p/original/msCHK5Kh1YbdZ0zPJ2nzPUhhSN9.jpg",
            releaseDate = LocalDate.parse("2002-10-01"),
            duration = 113,
            genre = "Ficcao cientifica",
            votes = (1..1000).random(),
            reviews = listOf(
                Review(
                    id = 1,
                    user = User(
                        id = 1,
                        name = "daniel.meneses"
                    ),
                    comment = "Depois de inúmeras indicações fui assistir a esse filme regular e cansativo, queria que uma turbina de avião caísse na minha casa agora e criasse um vórtice espaço-tempo para que eu voltasse no tempo e recuperasse as duas horas que perdi da minha vida. Grato pela trilha sonora.",
                    publishedDate = LocalDateTime.now(),
                    rating = (1..5).random()
                ),
                Review(
                    id = 2,
                    user = User(
                        id = 2,
                        name = "lohanne.guedes"
                    ),
                    comment = "Um filme surpreendente, trilha sonora impecável, atuação de todos é também impecável e uma história que lhe prende até o final! Mas algumas coisas são incompreensíveis, mas dentro do seu contexto, e pra quem gosta do gênero, é realmente um filme muito bom!",
                    publishedDate = LocalDateTime.now(),
                    rating = (1..5).random()
                ),
                Review(
                    id = 3,
                    user = User(
                        id = 3,
                        name = "maria.silva"
                    ),
                    comment = "Best series ever! Explains my life.",
                    publishedDate = LocalDateTime.now(),
                    rating = (1..5).random()
                ),
                Review(
                    id = 4,
                    user = User(
                        id = 4,
                        name = "fernanda.oliveira"
                    ),
                    comment = "Um dos melhores filmes dos anos 2000! Elenco forte, roteiro muito bem construído e um clímax de primeira! Filmaço!!!!",
                    publishedDate = LocalDateTime.now(),
                    rating = (1..5).random()
                ),
                Review(
                    id = 5,
                    user = User(
                        id = 5,
                        name = "amanda.santos"
                    ),
                    comment = "Possui um suspense interessante.Uma ótima apresentação de Jake Gyllenhaal,o melhor personagem dentro da trama.",
                    publishedDate = LocalDateTime.now(),
                    rating = (1..5).random()
                )
            )
        ),

        ContentItem(
            id = 2,
            title = "La piel que habito",
            description = " O filme narra a história do doutor Ledgard (Antonio Banderas), um eminente cirurgião plástico que quer criar uma nova pele graças aos avanços do tratamento celular. E ele se torna obcecado em se vingar do homem que estuprou sua filha.",
            banner = "https://www.cinemadebuteco.com.br/wp-content/uploads/2011/10/a-pele-que-habito.jpg",
            cover = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQT7-8BebfHhHYq7iaJBakjYEWb4x1YiyEwIg&s",
            releaseDate = LocalDate.parse("2011-09-02"),
            duration = 117,
            genre = "Terror",
            votes = (1..1000).random(),
            reviews = listOf(
                Review(
                    id = 6,
                    user = User(
                        id = 6,
                        name = "fernanda.oliveira"
                    ),
                    comment = "Horrorizante, espetacular, surpreendente e imprevisível, claro, com requintes de crueldade. Almodovar na essência. Filmaço. Quem tem estômago fraco, não deve assistir.",
                    publishedDate = LocalDateTime.now(),
                    rating = (1..5).random()
                ),
                Review(
                    id = 7,
                    user = User(
                        id = 7,
                        name = "vitoria.santos"
                    ),
                    comment = "Um filme de tirar o fôlego, no começo parece louco e sem nenhum nexo, mas ao desenrolar do roteiro ele traz um plot twist incrível. Vale muito a pena ver.",
                    publishedDate = LocalDateTime.now(),
                    rating = (1..5).random()
                ),
                Review(
                    id = 8,
                    user = User(
                        id = 8,
                        name = "gabriel.silva"
                    ),
                    comment = "Esse filme é sem palavras,forte,chocante que marca,mas macabro também,imagine que louco seria se fosse realidade,mas a trama é muito boa,tem mistério e suspense até o fim.",
                    publishedDate = LocalDateTime.now(),
                    rating = (1..5).random()
                ),
                Review(
                    id = 9,
                    user = User(
                        id = 9,
                        name = "nycolas.oliveira"
                    ),
                    comment = "Surpreendente e bem realizado o roteiro. Vale a pena ver mais um trabalho do Almodovar",
                    publishedDate = LocalDateTime.now(),
                    rating = (1..5).random()
                ),
                Review(
                    id = 10,
                    user = User(
                        id = 10,
                        name = "luana.santos"
                    ),
                    comment = "Inusitado, fantástico, inteligente. Almodovar mais uma vez surpreendendo. Quem não gostou , não entendeu mas o filme não é chato. Amei",
                    publishedDate = LocalDateTime.now(),
                    rating = (1..5).random()
                )
            )
        ),
        ContentItem(
            id = 3,
            title = "Relatos Selvagens",
            description = " Um avião com pessoas que se conhecem, o retorno ao passado, uma briga de trânsito, traição amorosa e detalhes do cotidiano, são capazes de impelir esses personagens a perderem totalmente o controle.” Esse é um filme que exorciza nossos mais profundos desejos insanos.",
            banner = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRRRtnVIZfafrSVPrJJk7yDvh4dmub4LFq7rQ&s",
            cover = "https://ovodefantasma.wordpress.com/wp-content/uploads/2014/11/relatos-salvajes.jpg",
            releaseDate = LocalDate.parse("2014-08-21"),
            duration = 122,
            genre = "Suspense",
            votes = (1..1000).random(),
            reviews = listOf(
                Review(
                    id = 11,
                    user = User(
                        id = 11,
                        name = "jocimar.brito"
                    ),
                    comment = "Filme inteligente, divertido, engraçado e envolvente. Na minha opinião foi a grande surpresa do ano! Se vc for assistir, esteja preparado para prestar atenção às sutilezas, às mensagens subliminares, senão corre o risco de não entender de fato a mensagem de cada uma das 5 histórias e acha o filme sem graça.",
                    publishedDate = LocalDateTime.now(),
                    rating = (1..5).random()
                ),
                Review(
                    id = 12,
                    user = User(
                        id = 12,
                        name = "anavitoria.santos"
                    ),
                    comment = "O filme é impressionantemente \"humano\". Mostra pessoas comuns, como eu e você, que numa determinada situação, vira bicho e mostra o seu lado \"B\". Gostei muito, pois apesar do nome, não mostra violência demais. Vale a pena ver!",
                    publishedDate = LocalDateTime.now(),
                    rating = (1..5).random()
                ),
                Review(
                    id = 13,
                    user = User(
                        id = 13,
                        name = "fernando"
                    ),
                    comment = "Realmente muito bom! O filme representante tudo aquilo que o nosso lado sombrio seria capaz de fazer. O filme gera muito impacto e reflexão.",
                    publishedDate = LocalDateTime.now(),
                    rating = (1..5).random()
                ),
                Review(
                    id = 14,
                    user = User(
                        id = 14,
                        name = "vanessa.guedes"
                    ),
                    comment = "Aborda situações extremas de paranoia, repletas de humor negro. Filme bem original.",
                    publishedDate = LocalDateTime.now(),
                    rating = (1..5).random()
                ),
                Review(
                    id = 15,
                    user = User(
                        id = 15,
                        name = "leticia.bringel"
                    ),
                    comment = "Simplesmente imperdível. 6 historinhas para alegrar sua vida. Vale muito a pena conferir. Para quem gosta de humor negro ou quase isso, irá se divertir. Recomendo.",
                    publishedDate = LocalDateTime.now(),
                    rating = (1..5).random()
                )
            )
        ),
        ContentItem(
            id = 4,
            title = "The OA",
            description = "A série centra-se em Prairie Johnson (Brit Marling), uma jovem adotada e inicialmente cega, que ressurge depois de ter desaparecido por sete anos. Após seu retorno, Prairie se auto denomina como \"OA\", de \"Original Angel\" (\"Anjo Original\" em tradução livre), ela contém cicatrizes nas costas e a capacidade de enxergar.",
            banner = "https://i.pinimg.com/736x/cd/20/52/cd2052def02e59a9773e991298dde9e6.jpg",
            cover = "https://i.ytimg.com/vi/36DNocMXv5Q/hqdefault.jpg",
            releaseDate = LocalDate.parse("2016-12-16"),
            duration = 960,
            genre = "Ficcao cientifica",
            votes = (1..1000).random(),
            reviews = listOf(
                Review(
                    id = 16,
                    user = User(
                        id = 16,
                        name = "amora.carmal"
                    ),
                    comment = "Se você quiser perder 16 horas da sua vida... vá em frente aperto o play.... um lixo completo.......",
                    publishedDate = LocalDateTime.now(),
                    rating = (1..5).random()
                ),
                Review(
                    id = 17,
                    user = User(
                        id = 17,
                        name = "kira"
                    ),
                    comment = "A serie se perde em suas proprias historias ficticias várias vezes, e termina com muitas pontas sem soluções, série muito superestimada, realmente espera mais, achei bem ruim e com apenas muitos efeitos artisticos, não perderia meu tempo assistindo novamente e não recomendo",
                    publishedDate = LocalDateTime.now(),
                    rating = (1..5).random()
                ),
                Review(
                    id = 18,
                    user = User(
                        id = 18,
                        name = "lucas.silva"
                    ),
                    comment = "Maravilhosa série, não é para todos, mas quem deixa a porta aberta e confia em OA, certamente não se arrepende.",
                    publishedDate = LocalDateTime.now(),
                    rating = (1..5).random()
                ),
                Review(
                    id = 19,
                    user = User(
                        id = 19,
                        name = "nathan"
                    ),
                    comment = "Aqui temos uma temporada que tem um bom início, tem um desenrolar meio chato e um ato final atrativo, apesar de exagerado. Aqui finalizo ela.",
                    publishedDate = LocalDateTime.now(),
                    rating = (1..5).random()
                ),
                Review(
                    id = 20,
                    user = User(
                        id = 20,
                        name = "sabino"
                    ),
                    comment = "Não vou assistir. Não estou conseguindo nem terminar o 1° episódio. Muito chata! Série parada. Horrível! Os personagens não falam coisa com coisa. Parece que fumaram....",
                    publishedDate = LocalDateTime.now(),
                    rating = (1..5).random()
                )
            )
        ),
        ContentItem(
            id = 5,
            title = "Ruptura",
            description = "Neste vencedor do Emmy® do diretor Ben Stiller, Mark lidera uma equipe de funcionários de escritório cujas memórias foram cirurgicamente divididas entre o trabalho e a vida pessoal. Eles começam uma jornada para descobrir a verdade sobre seus empregos e sobre si mesmos.",
            banner = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRF5xPx9JX8s4GIxmUc_1dZCozrQUlGAyvghg&s",
            cover = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQkZZJW0Xqp60BPmhAYDyipPY93Xxkj-wA_BA&s",
            releaseDate = LocalDate.parse("2022-02-18"),
            duration = 1102,
            genre = "Suspense",
            votes = (1..1000).random(),
            reviews = listOf(
                Review(
                    id = 21,
                    user = User(
                        id = 21,
                        name = "fernanda.oliveira"
                    ),
                    comment = "Raramente pego para ver séries, mas essa me pegou, Ruptura nos prende do início ao fim, naquele suspense cada vez mais interessante. As viradas do roteiro vão nos envolvendo com a trama mais e mais. O design de produção é fantástico, a trilha sonora também é ótima, e o final, vai te deixar ansioso para uma nova temporada. Muito bom.",
                    publishedDate = LocalDateTime.now(),
                    rating = (1..5).random()
                ),
                Review(
                    id = 22,
                    user = User(
                        id = 22,
                        name = "vitoria.santos"
                    ),
                    comment = "1° Temporada com um elenco ótimo e atuações idem, com diálogos inteligentes e um roteiro bem quisto, apesar de alguns excessos na trama com explicações de mais, mesmo assim vale apena conferir.",
                    publishedDate = LocalDateTime.now(),
                    rating = (1..5).random()
                ),
                Review(
                    id = 23,
                    user = User(
                        id = 23,
                        name = "gabriel.silva"
                    ),
                    comment = "Roteiro muito bem elaborado, intrigantes te prende o começo ao fim\n" +
                            "confesso que algumas cenas são um tanto enrolados, atores muito bons\n" +
                            "uma série que vale a pena conferir, ansiosa para segunda temporada",
                    publishedDate = LocalDateTime.now(),
                    rating = (1..5).random()
                ),
                Review(
                    id = 24,
                    user = User(
                        id = 24,
                        name = "nycolas.oliveira"
                    ),
                    comment = "Uma série digna de ficar na frente da tela… ótimo enredo e excelentes atores e atrizes.. típico da qualidade\n" +
                            "Da Apple TV",
                    publishedDate = LocalDateTime.now(),
                    rating = (1..5).random()
                ),
                Review(
                    id = 25,
                    user = User(
                        id = 25,
                        name = "luana.santos"
                    ),
                    comment = "Conteúdo fraco, sem sentido e muito depressivo! Muitas vezes incompreensível, falta ação e sem um enredo que te prenda.",
                    publishedDate = LocalDateTime.now(),
                    rating = (1..5).random()
                )
            )
        ),
    )
}