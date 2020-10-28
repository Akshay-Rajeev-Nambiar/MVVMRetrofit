package com.example.mvvmretrofit.model

data class UserResponseData(
    val code: Int,
    val data: List<UserData>,
    val meta: Meta
)

data class UserData(
    val id: Int,
    val name: String,
    val email: String,
    val gender: String,
    val status: String,
    val created_at: String,
    val updated_at: String


) {
    override fun toString(): String {
        return "id : $id \n" +
                "name : $name \n" +
                "email : $email \n" +
                "gender : $gender \n" +
                "status : $status \n" +
                "created at : $created_at \n" +
                "updated at : $updated_at"
    }
}

data class Meta(
    val pagination: Pagination
)

data class Pagination(
    val total: Int,
    val page: Int,
    val pages: Int,
    val limit: Int
)