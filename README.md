# Anotações

## Iniciando o projeto

O arquivo MainActivity marca o inicio da aplicação e o que deve ser mostrado na primeira tela

```kt
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            /* Interface */
        }
    }
}
```

## Componentes

Alguns componentes comum do Jetpack Compose

```kt
    Row          // Linhas
    Column       // Colunas
    Box          // Sobrepostos
    Text         // Texto
    Button       // Botao
    IconButton   // Botao com Icone
    TextField    // Campo de Texto
```

Alguns parametros comuns

```kt
(
    modifier = Modifier
        .fillMaxWidth()
        .fillMaxSize()
        .padding(16.dp),

    verticalArrangement = Arrangement.Center|Bottom|End|Top|SpaceBetween|SpaceArround|SpaceEvenly|SpacedBy(16.dp, Alignment.CenterVertically)

    verticalAlignment = Alignment.CenterVertically|CenterHorizontally|End|Start

    horizontalArrangement = Arrangement.Center|Bottom|End|Top|SpaceBetween|SpaceArround|SpaceEvenly|SpacedBy(16.dp, Alignment.CenterHorizontally)

    horizontalAlignment = Alignment.CenterVertically|CenterHorizontally|End|Start
)
```

## Adicionando Rotas

https://developer.android.com/develop/ui/compose/navigation?hl=pt-br

```
@Composable
fun Navigator() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "welcome") {
        composable(route = "welcome") {
            Welcome(navController = navController)
        }
        composable(route = "register") {
            Register(navController = navController)
        }
        composable(route = "home") {
            Home()
        }
    }
}
```

## Persistência de dados

https://developer.android.com/training/data-storage/room?hl=pt-br
https://github.com/android/architecture-samples/tree/main

## HTTP

<uses-permission android:name="android.permission.INTERNET" />
https://developer.android.com/codelabs/basic-android-kotlin-compose-getting-data-internet?hl=pt-br#4
https://developer.android.com/develop/connectivity/network-ops/connecting?hl=pt-br

```
java.com.renanfsp.mgdb
|--database
|----dao
|----entities
|--models
|----User.kt
|--ui
|----Theme.kt
|----Color.kt
|----Type.kt
|--viewmodels
|--views
|--navigation
|----Navigator.kt
|-
|-
|--MainActivity.kt
```
