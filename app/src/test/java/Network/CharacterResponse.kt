package Network

data class CharacterResponse(
    val results:List<CharacterResult>
)
data class CharacterResult(
    val id:Int,
    val name:String,
    val image:String
)
