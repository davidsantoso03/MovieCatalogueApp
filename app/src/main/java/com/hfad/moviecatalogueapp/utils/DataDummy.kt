package com.hfad.moviecatalogueapp.utils

import com.hfad.moviecatalogueapp.model.Movie
import com.hfad.moviecatalogueapp.model.Tvshow

object DataDummy {

    fun generateMovieDummy(): List<Movie> {

        val movies = ArrayList<Movie>()

        movies.add(
                Movie(
                        "m1",
                        "Star is Born",
                        "Seasoned musician Jackson Maine discovers — and falls in love with — struggling artist Ally. She has just about given up on her dream to make it big as a singer — until Jack coaxes her into the spotlight. But even as Ally's career takes off, the personal side of their relationship is breaking down, as Jack fights an ongoing battle with his own internal demons.",
                        "https://www.themoviedb.org/t/p/w1280/wrFpXMNBRj2PBiN4Z5kix51XaIZ.jpg",
                        "10/05/2018",
                        "Drama",
                        "75%",
                        "Bradley Cooper",
                        "2h 16m"
                )
        )
        movies.add(
                Movie(
                        "m2",
                        "Alita:Battle Angel(2019)",
                        "When Alita awakens with no memory of who she is in a future world she does not recognize, she is taken in by Ido, a compassionate doctor who realizes that somewhere in this abandoned cyborg shell is the heart and soul of a young woman with an extraordinary past.",
                        "https://www.themoviedb.org/t/p/w1280/xRWht48C2V8XNfzvPehyClOvDni.jpg",
                        "02/14/2019",
                        "Science Fiction",
                        "72%",
                        "Robert Rodriguez",
                        "2h 2m"
                )
        )
        movies.add(
                Movie(
                        "m3",
                        "Bohemian Rhapsody (2018)",
                        "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock 'n' roll band Queen in 1970. Hit songs become instant classics. When Mercury's increasingly wild lifestyle starts to spiral out of control, Queen soon faces its greatest challenge yet – finding a way to keep the band together amid the success and excess.",
                        "https://www.themoviedb.org/t/p/w1280/lHu1wtNaczFPGFDTrjCSzeLPTKN.jpg",
                        "11/02/2018 ",
                        "Music",
                        "80%",
                        "Bryan Singer",
                        "2h 15m"
                )
        )
        movies.add(
                Movie(
                        "m4",
                        "Cold Pursuit (2019)",
                        "The quiet family life of Nels Coxman, a snowplow driver, is upended after his son's murder. Nels begins a vengeful hunt for Viking, the drug lord he holds responsible for the killing, eliminating Viking's associates one by one. As Nels draws closer to Viking, his actions bring even more unexpected and violent consequences, as he proves that revenge is all in the execution.",
                        "https://www.themoviedb.org/t/p/w1280/hXgmWPd1SuujRZ4QnKLzrj79PAw.jpg",
                        "02/08/2019 ",
                        "Action",
                        "57%",
                        "Hans Petter Moland",
                        "1h 59m"
                )
        )
        movies.add(
                Movie(
                        "m5",
                        "Creed II (2018)",
                        "Between personal obligations and training for his next big fight against an opponent with ties to his family's past, Adonis Creed is up against the challenge of his life.",
                        "https://www.themoviedb.org/t/p/w1280/v3QyboWRoA4O9RbcsqH8tJMe8EB.jpg",
                        "11/21/2018",
                        "Drama",
                        "69%",
                        "Steven Caple Jr.",
                        "2h 10m"
                )
        )
        movies.add(
                Movie(
                        "m6",
                        "Aquaman (2018)",
                        "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne.",
                        "https://www.themoviedb.org/t/p/w1280/vEj13Ro7d2qjgeHI0eyqb7wMjvO.jpg",
                        "12/21/2018",
                        "Fantasy",
                        "69%",
                        "James Wan",
                        "2h 23m"
                )
        )
        movies.add(
                Movie(
                        "m7",
                        "Fantastic Beasts: The Crimes of Grindelwald (2018)",
                        "Gellert Grindelwald has escaped imprisonment and has begun gathering followers to his cause—elevating wizards above all non-magical beings. The only one capable of putting a stop to him is the wizard he once called his closest friend, Albus Dumbledore. ",
                        "https://www.themoviedb.org/t/p/w1280/u5QrKhSCGoFsB8aAvZZJ1b53k16.jpg",
                        "11/16/2018",
                        "Drama",
                        "69%",
                        "David Yates",
                        "2h 14m"
                )
        )
        movies.add(
                Movie(
                        "m8",
                        "Glass (2019)",
                        "In a series of escalating encounters, former security guard David Dunn uses his supernatural abilities to track Kevin Wendell Crumb, a disturbed man who has twenty-four personalities. Meanwhile, the shadowy presence of Elijah Price emerges as an orchestrator who holds secrets critical to both men.",
                        "https://www.themoviedb.org/t/p/w1280/svIDTNUoajS8dLEo7EosxvyAsgJ.jpg",
                        "01/18/2019",
                        "Thriller",
                        "67%",
                        "M. Night Shyamalan",
                        "2h 9m"
                )
        )
        movies.add(
                Movie(
                        "m9",
                        "How to Train Your Dragon: The Hidden World (2019)",
                        "As Hiccup fulfills his dream of creating a peaceful dragon utopia, Toothless’ discovery of an untamed, elusive mate draws the Night Fury away. When danger mounts at home and Hiccup’s reign as village chief is tested, both dragon and rider must make impossible decisions to save their kind.",
                        "https://www.themoviedb.org/t/p/w1280/xvx4Yhf0DVH8G4LzNISpMfFBDy2.jpg",
                        "01/09/2019",
                        "Animation",
                        "78%",
                        "Dean DeBlois",
                        "1h 44m"
                )
        )
        movies.add(
                Movie(
                        "m10",
                        "Avengers: Infinity War (2018)",
                        "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.",
                        "https://www.themoviedb.org/t/p/w1280/7WsyChQLEftFiDOVTGkv3hFpyyt.jpg",
                        "04/27/2018",
                        "Adventure,Action",
                        "83%",
                        "Joe Russo,Anthony Russo",
                        "2h 29m"
                )
        )
        movies.add(
                Movie(
                        "m11",
                        "Master Z: Ip Man Legacy (2018)",
                        "Following his defeat by Master Ip, Cheung Tin Chi tries to make a life with his young son in Hong Kong, waiting tables at a bar that caters to expats. But it's not long before the mix of foreigners, money, and triad leaders draw him once again to the fight.",
                        "https://www.themoviedb.org/t/p/w1280/7Hy0qn054TBkapuCutQKeebaGJE.jpg",
                        "12/26/2018",
                        "Action",
                        "60%",
                        "Yuen Woo-Ping",
                        "1h 47m"
                )
        )
        movies.add(
                Movie(
                        "m12",
                        "Mortal Engines (2018)",
                        "Many thousands of years in the future, Earth’s cities roam the globe on huge wheels, devouring each other in a struggle for ever diminishing resources. On one of these massive traction cities, the old London, Tom Natsworthy has an unexpected encounter with a mysterious young woman from the wastelands who will change the course of his life forever.",
                        "https://www.themoviedb.org/t/p/w1280/gLhYg9NIvIPKVRTtvzCWnp1qJWG.jpg",
                        "12/14/2018 ",
                        "Adventure,Science Fiction",
                        "61%",
                        "Christian Rivers",
                        "2h 9m"
                )
        )
        movies.add(
                Movie(
                        "m13",
                        "Overlord (2018)",
                        "France, June 1944. On the eve of D-Day, some American paratroopers fall behind enemy lines after their aircraft crashes while on a mission to destroy a radio tower in a small village near the beaches of Normandy. After reaching their target, the surviving paratroopers realise that, in addition to fighting the Nazi troops that patrol the village, they also must fight against something else.",
                        "https://www.themoviedb.org/t/p/w1280/l76Rgp32z2UxjULApxGXAPpYdAP.jpg",
                        "11/09/2018 ",
                        "Horror",
                        "67%",
                        "Julius Avery",
                        "1h 50m"
                )
        )
        movies.add(
                Movie(
                        "m14",
                        "Ralph Breaks the Internet (2018)",
                        "Video game bad guy Ralph and fellow misfit Vanellope von Schweetz must risk it all by traveling to the World Wide Web in search of a replacement part to save Vanellope's video game, Sugar Rush. In way over their heads, Ralph and Vanellope rely on the citizens of the internet — the netizens — to help navigate their way, including an entrepreneur named Yesss, who is the head algorithm and the heart and soul of trend-making site BuzzzTube.",
                        "https://www.themoviedb.org/t/p/w1280/h5XilerWmJbM5kiBtWML8vvHbkH.jpg",
                        "11/21/2018",
                        "Animation",
                        "72%",
                        "Phil Johnston,Rich Moore",
                        "1h 52m"
                )
        )
        movies.add(
                Movie(
                        "m15",
                        "Spider-Man: Into the Spider-Verse (2018)",
                        "Miles Morales is juggling his life between being a high school student and being a spider-man. When Wilson \"Kingpin\" Fisk uses a super collider, others from across the Spider-Verse are transported to this dimension.",
                        "https://www.themoviedb.org/t/p/w1280/3cZn1k8x0bikrDKEy9ZKJ6Vdj30.jpg",
                        "12/14/2018",
                        "Action",
                        "84%",
                        "Bob Persichetti,Peter Ramsey,Rodney Rothman",
                        "1h 57m"
                )
        )


        return movies
    }

    fun generateTvShowDummy(): List<Tvshow> {

        val tv = ArrayList<Tvshow>()

        tv.add(
                Tvshow(
                        "t1",
                        "Family Guy",
                        "Sick, twisted, politically incorrect and Freakin' Sweet animated series featuring the adventures of the dysfunctional Griffin family. Bumbling Peter and long-suffering Lois have three kids. Stewie (a brilliant but sadistic baby bent on killing his mother and taking over the world), Meg (the oldest, and is the most unpopular girl in town) and Chris (the middle kid, he's not very bright but has a passion for movies). The final member of the family is Brian - a talking dog and much more than a pet, he keeps Stewie in check whilst sipping Martinis and sorting through his own life issues.",
                        "https://www.themoviedb.org/t/p/w1280/pneUOubHFd632I1lIO23J93Wn4A.jpg",
                        "1999",
                        "Animation,Comedy",
                        "70%",
                        "Seth MacFarlane",
                        "22m"
                )
        )
        tv.add(
                Tvshow(
                        "t2",
                        "Arrow",
                        "Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.",
                        "https://www.themoviedb.org/t/p/w1280/zfOb5lRt9SekVyl0gLfrXikQfxn.jpg",
                        "10/10/2012",
                        "Adventure",
                        "66%",
                        "Marc Guggenheim,Greg Berlanti,Andrew Kreisberg",
                        "42m"
                )
        )
        tv.add(
                Tvshow(
                        "t3",
                        "The Simpsons (1989)",
                        "Set in Springfield, the average American town, the show focuses on the antics and everyday adventures of the Simpson family; Homer, Marge, Bart, Lisa and Maggie, as well as a virtual cast of thousands. Since the beginning, the series has been a pop culture icon, attracting hundreds of celebrities to guest star. The show has also made name for itself in its fearless satirical take on politics, media and American life in general.",
                        "https://www.themoviedb.org/t/p/w1280/k5UALlcA0EnviaCUn2wMjOWYiOO.jpg",
                        "12/17/1989",
                        "Comedy",
                        "78%",
                        "Matt Groening",
                        "22m"
                )
        )
        tv.add(
                Tvshow(
                        "t4",
                        "Supergirl",
                        "Twenty-four-year-old Kara Zor-El, who was taken in by the Danvers family when she was 13 after being sent away from Krypton, must learn to embrace her powers after previously hiding them. The Danvers teach her to be careful with her powers, until she has to reveal them during an unexpected disaster, setting her on her journey of heroism. ",
                        "https://www.themoviedb.org/t/p/w1280/vqBsgL9nd2v04ZvCqPzwtckDdFD.jpg",
                        "10/16/2015",
                        "Drama",
                        "73%",
                        "Andrew Kreisberg,Greg Berlanti, Ali Adler",
                        "42m"
                )
        )
        tv.add(
                Tvshow(
                        "t5",
                        "Supernatural",
                        "When they were boys, Sam and Dean Winchester lost their mother to a mysterious and demonic supernatural force. Subsequently, their father raised them to be soldiers. He taught them about the paranormal evil that lives in the dark corners and on the back roads of America ... and he taught them how to kill it. Now, the Winchester brothers crisscross the country in their '67 Chevy Impala, battling every kind of supernatural threat they encounter along the way.",
                        "https://www.themoviedb.org/t/p/w1280/rp7yEfhHLiLG1YxEclj1urc5bTR.jpg",
                        "11/13/2005",
                        "Drama",
                        "82%",
                        "Eric Kripke",
                        "45m"
                )
        )
        tv.add(
                Tvshow(
                        "t6",
                        "The Umbrella Academy ",
                        "A dysfunctional family of superheroes comes together to solve the mystery of their father's death, the threat of the apocalypse and more.",
                        "https://www.themoviedb.org/t/p/w1280/uYHdIs5O8tiU5p6MvUPd2jElOH6.jpg",
                        "2/15/2019",
                        "Action & Adventure",
                        "87%",
                        "Steve Blackman",
                        "55m"
                )
        )
        tv.add(
                Tvshow(
                        "t7",
                        "The Walking Dead",
                        "Sheriff's deputy Rick Grimes awakens from a coma to find a post-apocalyptic world dominated by flesh-eating zombies. He sets out to find his family and encounters many other survivors along the way.",
                        "https://www.themoviedb.org/t/p/w1280/bjU4tLlyp8W4yTB0Hqn8J1IDUnD.jpg",
                        "10/31/2010",
                        "Action & Adventure",
                        "81%",
                        "Frank Darabont",
                        "42m"
                )
        )
        tv.add(
                Tvshow(
                        "t8",
                        "Shameless",
                        "Chicagoan Frank Gallagher is the proud single dad of six smart, industrious, independent kids, who without him would be... perhaps better off. When Frank's not at the bar spending what little money they have, he's passed out on the floor. But the kids have found ways to grow up in spite of him. They may not be like any family you know, but they make no apologies for being exactly who they are.",
                        "https://www.themoviedb.org/t/p/w1280/iRyQTp2L437k6zfFCvZSOWaxQFA.jpg",
                        "01/09/2011",
                        "Comedy",
                        "80%",
                        "John Wells,Paul Abbott",
                        "57m"
                )
        )
        tv.add(
                Tvshow(
                        "t9",
                        "Riverdale",
                        "Set in the present, the series offers a bold, subversive take on Archie, Betty, Veronica and their friends, exploring the surreality of small-town life, the darkness and weirdness bubbling beneath Riverdale’s wholesome facade.",
                        "https://www.themoviedb.org/t/p/w1280/gskv297rlbyzLaTU1XZf8UBbxp0.jpg",
                        "01/26/2017",
                        "Mystery",
                        "86%",
                        "Roberto Aguirre-Sacasa",
                        "45m"
                )
        )
        tv.add(
                Tvshow(
                        "t10",
                        "NCIS",
                        "From murder and espionage to terrorism and stolen submarines, a team of special agents investigates any crime that has a shred of evidence connected to Navy and Marine Corps personnel, regardless of rank or position.",
                        "https://www.themoviedb.org/t/p/w1280/eoj15m14Zpf2bUWXqNIs7itZK9w.jpg",
                        "11/03/2003",
                        "Crime",
                        "74%",
                        "Donald P. Bellisario,Don McGill",
                        "45m"
                )
        )
        tv.add(
                Tvshow(
                        "t11",
                        "Marvel Iron Fist",
                        "Danny Rand resurfaces 15 years after being presumed dead. Now, with the power of the Iron Fist, he seeks to reclaim his past and fulfill his destiny.",
                        "https://www.themoviedb.org/t/p/w1280/4l6KD9HhtD6nCDEfg10Lp6C6zah.jpg",
                        "03/13/2017",
                        "Action & Adventure",
                        "66%",
                        "Scott Buck",
                        "55m"
                )
        )
        tv.add(
                Tvshow(
                        "t12",
                        "Hanna",
                        "This thriller and coming-of-age drama follows the journey of an extraordinary young girl as she evades the relentless pursuit of an off-book CIA agent and tries to unearth the truth behind who she is. Based on the 2011 Joe Wright film.",
                        "https://www.themoviedb.org/t/p/w1280/5nSSkcM3TgpllZ7yTyBOQEgAX36.jpg",
                        "03/28/2019",
                        "Action & Adventure",
                        "75%",
                        "David Farr",
                        "50m"
                )
        )
        tv.add(
                Tvshow(
                        "t13",
                        "Grey's Anatomy",
                        "Follows the personal and professional lives of a group of doctors at Seattle’s Grey Sloan Memorial Hospital.",
                        "https://www.themoviedb.org/t/p/w1280/mgOZSS2FFIGtfVeac1buBw3Cx5w.jpg",
                        "03/27/2005",
                        "Drama",
                        "%",
                        "Shonda Rhimes",
                        "43m"
                )
        )
        tv.add(
                Tvshow(
                        "t14",
                        "Gotham",
                        "Everyone knows the name Commissioner Gordon. He is one of the crime world's greatest foes, a man whose reputation is synonymous with law and order. But what is known of Gordon's story and his rise from rookie detective to Police Commissioner? What did it take to navigate the multiple layers of corruption that secretly ruled Gotham City, the spawning ground of the world's most iconic villains? And what circumstances created them – the larger-than-life personas who would become Catwoman, The Penguin, The Riddler, Two-Face and The Joker?",
                        "https://www.themoviedb.org/t/p/w1280/4XddcRDtnNjYmLRMYpbrhFxsbuq.jpg",
                        "11/22/2014",
                        "Sci-Fi & Fantasy",
                        "75%",
                        "Bruno Heller",
                        "43m"
                )
        )
        tv.add(
                Tvshow(
                        "t15",
                        "Game Of Thrones(GOT)",
                        "Seven noble families fight for control of the mythical land of Westeros. Friction between the houses leads to full-scale war. All while a very ancient evil awakens in the farthest north. Amidst the war, a neglected military order of misfits, the Night's Watch, is all that stands between the realms of men and icy horrors beyond.",
                        "https://www.themoviedb.org/t/p/w1280/gwPSoYUHAKmdyVywgLpKKA4BjRr.jpg",
                        "04/17/2011",
                        "Sci-Fi & Fantasy",
                        "84%",
                        "David Benioff,D. B. Weiss",
                        "1h"
                )
        )






        return tv
    }
}
