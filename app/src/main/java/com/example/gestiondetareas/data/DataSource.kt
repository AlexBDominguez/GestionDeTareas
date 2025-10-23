package com.example.gestiondetareas.data

import com.example.gestiondetareas.model.Tarea

object DataSource {


    fun cargarTareasJson(): List<com.example.gestiondetareas.model.Tarea> {
        return listOf(

            Tarea(
                id = 1,
                tarea = "Haz algo bueno por alguien que te importa",
                descripcion = "Dedica un momento a demostrar tu aprecio hacia alguien especial. Puede ser un pequeño gesto, una llamada, un regalo o simplemente escuchar. Las acciones sinceras fortalecen vínculos y mejoran el bienestar emocional de ambas personas involucradas en el acto.",
                completado = false,
                fecha_tope = "19/12/2026"
            ),

            Tarea(
                id = 2,
                tarea = "Memorizar un poema",
                descripcion = "Escoge un poema que te inspire o emocione y apréndelo de memoria. Este ejercicio mejora la concentración, estimula la memoria y fomenta una conexión más profunda con el lenguaje y las emociones transmitidas por la literatura clásica o contemporánea.",
                completado = true,
                fecha_tope = "05/04/2025"
            ),

            Tarea(
                id = 3,
                tarea = "Ver una película clásica",
                descripcion = "Elige una película considerada un clásico del cine y disfrútala con atención. Analiza su fotografía, guion y actuaciones. Comprender el contexto histórico y artístico de estas obras amplía la apreciación cultural y cinematográfica de manera enriquecedora.",
                completado = true,
                fecha_tope = "02/11/2024"
            ),

            Tarea(
                id = 4,
                tarea = "Ver un documental",
                descripcion = "Selecciona un documental sobre un tema que despierte tu curiosidad. Puede ser naturaleza, historia, ciencia o cultura. Este tipo de contenido amplía tu conocimiento y fomenta una comprensión más profunda del mundo que te rodea cada día.",
                completado = false,
                fecha_tope = "23/11/2025"
            ),

            Tarea(
                id = 5,
                tarea = "Invertir en criptomonedas",
                descripcion = "Investiga sobre el mundo de las criptomonedas y realiza una pequeña inversión informada. Aprende sobre riesgos, seguridad y tecnología blockchain. Esta experiencia te permitirá adquirir conocimientos financieros útiles y entender mejor la economía digital moderna actual.",
                completado = false,
                fecha_tope = "07/06/2026"
            ),

            Tarea(
                id = 6,
                tarea = "Contribuir con código o una donación monetaria a un proyecto de software de código abierto",
                descripcion = "Apoya la comunidad de software libre colaborando con tus habilidades técnicas o mediante una contribución económica. Tu ayuda impulsa proyectos útiles para millones de personas y fomenta el aprendizaje compartido dentro del ecosistema tecnológico global.",
                completado = false,
                fecha_tope = "25/08/2026"
            ),

            Tarea(
                id = 7,
                tarea = "Resolver un cubo de Rubik",
                descripcion = "Aprende a resolver el cubo de Rubik utilizando técnicas y algoritmos básicos. Este desafío estimula el pensamiento lógico, la memoria espacial y la paciencia, promoviendo la concentración y el disfrute mediante la resolución de problemas complejos y visuales.",
                completado = true,
                fecha_tope = "16/01/2025"
            ),

            Tarea(
                id = 8,
                tarea = "Hornea pasteles para ti y para tu vecino",
                descripcion = "Prepara unos deliciosos pasteles caseros y compártelos con tus vecinos. Cocinar para otros genera conexión, amabilidad y sentido de comunidad. Además, practicarás habilidades culinarias mientras creas momentos agradables y dulces con quienes te rodean.",
                completado = true,
                fecha_tope = "11/02/2025"
            ),

            Tarea(
                id = 9,
                tarea = "Ve a ver una producción de Broadway",
                descripcion = "Asiste a una producción teatral profesional para vivir una experiencia artística completa. Disfruta de la música, el baile y las interpretaciones en vivo. El teatro fomenta la apreciación cultural y ofrece inspiración a través de historias humanas poderosas.",
                completado = false,
                fecha_tope = "08/11/2026"
            ),

            Tarea(
                id = 10,
                tarea = "Escribe una carta de agradecimiento a una persona influyente en tu vida",
                descripcion = "Dedica tiempo a escribir una carta sincera expresando gratitud a alguien que haya marcado tu vida. Este acto fortalece relaciones, promueve la empatía y te ayuda a reflexionar sobre el valor del reconocimiento personal auténtico hacia los demás.",
                completado = true,
                fecha_tope = "28/12/2024"
            ),

            Tarea(
                id = 11,
                tarea = "Invita a algunos amigos a una noche de juegos",
                descripcion = "Organiza una noche divertida con amigos para compartir juegos de mesa, risas y buena compañía. Este tipo de encuentros fortalecen vínculos sociales, alivian el estrés y fomentan la comunicación y la colaboración entre los participantes presentes.",
                completado = false,
                fecha_tope = "01/11/2025"
            ),

            Tarea(
                id = 12,
                tarea = "Jugar un partido de fútbol con algunos amigos",
                descripcion = "Reúne a tus amigos para un partido amistoso de fútbol. Este ejercicio promueve la actividad física, el trabajo en equipo y la diversión. Además, ayuda a liberar tensiones y mejora la coordinación motora y el bienestar general.",
                completado = false,
                fecha_tope = "17/12/2025"
            ),

            Tarea(
                id = 13,
                tarea = "Envíale un mensaje de texto a un amigo con el que no has hablado en mucho tiempo",
                descripcion = "Recupera la comunicación con un amigo distante enviándole un mensaje afectuoso. Este pequeño gesto puede reavivar relaciones valiosas y fortalecer tu red emocional. La conexión humana siempre aporta alegría y bienestar a ambos interlocutores sinceros.",
                completado = true,
                fecha_tope = "10/11/2024"
            ),

            Tarea(
                id = 14,
                tarea = "Organizar la despensa",
                descripcion = "Dedica tiempo a limpiar y reorganizar tu despensa. Clasifica alimentos, desecha lo caducado y optimiza el espacio. Este hábito mejora el orden doméstico, facilita la cocina diaria y fomenta una vida más práctica y organizada continuamente.",
                completado = false,
                fecha_tope = "30/12/2025"
            ),

            Tarea(
                id = 15,
                tarea = "Comprar una nueva decoración para la casa",
                descripcion = "Renueva el ambiente de tu hogar con nuevos elementos decorativos. Pequeños cambios como plantas, cuadros o textiles aportan frescura, bienestar y reflejan tu personalidad. Invertir en tu espacio mejora el ánimo y la comodidad diaria.",
                completado = true,
                fecha_tope = "26/01/2024"
            ),

            Tarea(
                id = 16,
                tarea = "Planifica las vacaciones que siempre has querido tomar",
                descripcion = "Investiga destinos, presupuestos y actividades para las vacaciones de tus sueños. Planificar con anticipación aumenta la motivación, reduce el estrés y convierte tus aspiraciones en metas alcanzables que te llenan de ilusión y propósito.",
                completado = true,
                fecha_tope = "21/03/2024"
            ),

            Tarea(
                id = 17,
                tarea = "Limpiar el coche",
                descripcion = "Dedica una tarde a limpiar y organizar tu coche. Lava el exterior, aspira el interior y elimina objetos innecesarios. Mantener el vehículo limpio mejora tu confort, seguridad y refleja cuidado personal y responsabilidad diaria continua.",
                completado = false,
                fecha_tope = "03/12/2025"
            ),

            Tarea(
                id = 18,
                tarea = "Dibuja y colorea un Mandala",
                descripcion = "Crea un mandala utilizando lápices de colores o marcadores. Esta actividad estimula la creatividad, fomenta la relajación y mejora la concentración. Colorear patrones simétricos ayuda a alcanzar un estado de calma y equilibrio emocional profundo.",
                completado = true,
                fecha_tope = "29/11/2025"
            ),

            Tarea(
                id = 19,
                tarea = "Crea un libro de cocina con tus recetas favoritas",
                descripcion = "Reúne tus recetas más queridas en un libro personal. Escribe instrucciones, agrega fotos y comentarios. Este proyecto conserva tradiciones familiares, fomenta la creatividad culinaria y puede convertirse en un regalo significativo lleno de recuerdos compartidos.",
                completado = true,
                fecha_tope = "09/01/2024"
            ),

            Tarea(
                id = 20,
                tarea = "Hornear un pastel con algunos amigos",
                descripcion = "Invita a tus amigos a hornear un pastel juntos. Cocinar en grupo refuerza la amistad, mejora las habilidades culinarias y crea recuerdos agradables. Disfruten el proceso y celebren el resultado compartiendo una experiencia deliciosa.",
                completado = false,
                fecha_tope = "15/11/2025"
            ),

            Tarea(
                id = 21,
                tarea = "Crear una pila de compost",
                descripcion = "Comienza un proyecto ecológico creando una pila de compost en casa. Utiliza restos orgánicos y aprende sobre sostenibilidad. Este hábito reduce residuos, mejora el suelo y promueve un estilo de vida más responsable con el medio ambiente.",
                completado = false,
                fecha_tope = "22/11/2026"
            ),

            Tarea(
                id = 22,
                tarea = "Haz una caminata en un parque local",
                descripcion = "Sal a caminar por un parque cercano y disfruta del contacto con la naturaleza. Este paseo relaja la mente, mejora la circulación y te permite desconectarte del estrés diario mientras aprecias el entorno natural que te rodea.",
                completado = true,
                fecha_tope = "06/02/2025"
            ),

            Tarea(
                id = 23,
                tarea = "Toma una clase en el centro comunitario local que te interese",
                descripcion = "Apúntate a una clase sobre un tema nuevo que despierte tu curiosidad. Aprender en comunidad fomenta la creatividad, la socialización y el desarrollo personal. Descubrir nuevas habilidades puede abrir oportunidades y enriquecer tu rutina cotidiana.",
                completado = true,
                fecha_tope = "13/12/2024"
            ),

            Tarea(
                id = 24,
                tarea = "Investigar un tema que me interese",
                descripcion = "Dedica tiempo a investigar un tema que te apasione. Usa fuentes confiables y toma notas. Este proceso fortalece el pensamiento crítico, amplía tu conocimiento y despierta la curiosidad intelectual de forma práctica y enriquecedora personal.",
                completado = true,
                fecha_tope = "27/11/2024"
            ),

            Tarea(
                id = 25,
                tarea = "Planificar un viaje a otro país",
                descripcion = "Elige un país que quieras visitar, investiga su cultura, clima y requisitos de viaje. Planificar con detalle te prepara mejor y hace más real el sueño de explorar nuevos lugares y experiencias inolvidables internacionales culturales.",
                completado = false,
                fecha_tope = "20/11/2026"
            ),

            Tarea(
                id = 26,
                tarea = "Mejorar la mecanografía táctil",
                descripcion = "Practica la mecanografía sin mirar el teclado usando programas o ejercicios en línea. Mejorar esta habilidad aumenta tu productividad, precisión y velocidad al escribir, facilitando el trabajo digital y la comunicación profesional eficiente.",
                completado = false,
                fecha_tope = "24/12/2025"
            ),

            Tarea(
                id = 27,
                tarea = "Aprender Express.js",
                descripcion = "Explora Express.js, un framework para Node.js que facilita el desarrollo de aplicaciones web. Aprenderlo te ayudará a crear servidores eficientes, comprender mejor el backend y mejorar tus competencias en programación moderna full stack.",
                completado = false,
                fecha_tope = "04/12/2025"
            ),

            Tarea(
                id = 28,
                tarea = "Aprender caligrafía",
                descripcion = "Dedica tiempo a practicar la escritura artística con diferentes estilos de caligrafía. Este arte mejora la motricidad fina, fomenta la paciencia y proporciona una forma relajante y estética de expresarte a través del trazo manual.",
                completado = false,
                fecha_tope = "12/12/2025"
            ),

            Tarea(
                id = 29,
                tarea = "Hacer una sesión de fotos con unos amigos",
                descripcion = "Organiza una sesión de fotos divertida con tus amigos. Experimenten con poses, luces y paisajes. Esta actividad fortalece la amistad, estimula la creatividad y deja recuerdos visuales llenos de alegría y espontaneidad compartida.",
                completado = true,
                fecha_tope = "18/01/2025"
            ),

            Tarea(
                id = 30,
                tarea = "Ir al gimnasio",
                descripcion = "Acude regularmente al gimnasio para mejorar tu salud física y mental. El ejercicio fortalece músculos, libera endorfinas y reduce el estrés. Crear una rutina constante fomenta disciplina, bienestar y energía positiva para afrontar cada día.",
                completado = true,
                fecha_tope = "14/11/2024"
            )
        )
    }
}