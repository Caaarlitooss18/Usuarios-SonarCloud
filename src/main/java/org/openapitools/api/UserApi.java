/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.9.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.annotation.Generated;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.openapitools.model.LoginRequest;
import org.openapitools.model.User;
import org.openapitools.model.Video;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.servlet.view.RedirectView;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-15T15:55:01.292135700+02:00[Europe/Madrid]", comments = "Generator version: 7.9.0")
@Validated
@Tag(name = "user", description = "Operaciones sobre los usuarios")
public interface UserApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /user : Crea un usuario
     * Solo se podra hacer si el usuario ha iniciado sesion.
     *
     * @param user Crea un objeto User (optional)
     * @return operacion exitosa (status code 200)
     */
    @Operation(
        operationId = "createUser",
        summary = "Crea un usuario",
        description = "Solo se podra hacer si el usuario ha iniciado sesion.",
        tags = { "user" },
        responses = {
            @ApiResponse(responseCode = "default", description = "operacion exitosa", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = User.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/user",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default ResponseEntity<User> createUser(
        @Parameter(name = "User", description = "Crea un objeto User") @Valid @RequestBody(required = false) User user
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"lastName\" : \"James\", \"country\" : \"Spain\", \"role\" : \"User\", \"birthdate\" : \"1990-01-01\", \"bio\" : \"Esta es la descripcion de user1\", \"uploadedVideos\" : [ 101, 101 ], \"watchedVideos\" : [ 202, 202 ], \"firstName\" : \"John\", \"profilePicture\" : \"https://example.com/images/user1.jpg\", \"password\" : \"12345\", \"followers\" : [ 15, 15 ], \"following\" : [ 20, 20 ], \"id\" : 10, \"email\" : \"john@email.com\", \"username\" : \"user1\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /user/{username} : Borrar usuario
     * Solo se puede hacer si el usuario ha iniciado sesion.
     *
     * @param username El nombre del usuario a borrar (required)
     * @return operacion exitosa (status code 200)
     *         or Invalid username supplied (status code 400)
     *         or User not found (status code 404)
     */
    @Operation(
        operationId = "deleteUser",
        summary = "Borrar usuario",
        description = "Solo se puede hacer si el usuario ha iniciado sesion.",
        tags = { "user" },
        responses = {
            @ApiResponse(responseCode = "200", description = "operacion exitosa"),
            @ApiResponse(responseCode = "400", description = "Invalid username supplied"),
            @ApiResponse(responseCode = "404", description = "User not found")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/user/{username}"
    )
    
    default ResponseEntity<Void> deleteUser(@PathVariable String username
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /user/{username}/followers : Se obtiene una lista de seguidores del usuario.
     * 
     *
     * @param username El nombre por el que se requieren sus seguidores  (required)
     * @return operacion exitosa (status code 200)
     */
    @Operation(
        operationId = "getFollowers",
        summary = "Se obtiene una lista de seguidores del usuario.",
        description = "",
        tags = { "user" },
        responses = {
            @ApiResponse(responseCode = "default", description = "operacion exitosa")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/user/{username}/followers"
    )
    
    default ResponseEntity<Void> getFollowers(
        @Parameter(name = "username", description = "El nombre por el que se requieren sus seguidores ", required = true, in = ParameterIn.PATH) @PathVariable("username") String username
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /user/{username}/following : Se obtiene una lista de usuarios seguidos por el usuario.
     * 
     *
     * @param username El nombre por el que se los usuarios que sigue  (required)
     * @return operacion exitosa (status code 200)
     */
    @Operation(
        operationId = "getFollowing",
        summary = "Se obtiene una lista de usuarios seguidos por el usuario.",
        description = "",
        tags = { "user" },
        responses = {
            @ApiResponse(responseCode = "default", description = "operacion exitosa")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/user/{username}/following"
    )
    
    default ResponseEntity<Void> getFollowing(
        @Parameter(name = "username", description = "El nombre por el que se los usuarios que sigue ", required = true, in = ParameterIn.PATH) @PathVariable("username") String username
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /user/{username} : Hacer un get del usuario por el nombre
     * 
     *
     * @param username El nombre por el que se busca. Usar user1 para testing.  (required)
     * @return operacion exitosa (status code 200)
     *         or Invalid username supplied (status code 400)
     *         or User not found (status code 404)
     */
    @Operation(
        operationId = "getUserByName",
        summary = "Hacer un get del usuario por el nombre",
        description = "",
        tags = { "user" },
        responses = {
            @ApiResponse(responseCode = "200", description = "operacion exitosa", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = User.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid username supplied"),
            @ApiResponse(responseCode = "404", description = "User not found")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/user/{username}",
        produces = { "application/json" }
    )
    
    default ResponseEntity<User> getUserByName(
        @Parameter(name = "username", description = "El nombre por el que se busca. Usar user1 para testing. ", required = true, in = ParameterIn.PATH) @PathVariable("username") String username
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"lastName\" : \"James\", \"country\" : \"Spain\", \"role\" : \"User\", \"birthdate\" : \"1990-01-01\", \"bio\" : \"Esta es la descripcion de user1\", \"uploadedVideos\" : [ 101, 101 ], \"watchedVideos\" : [ 202, 202 ], \"firstName\" : \"John\", \"profilePicture\" : \"https://example.com/images/user1.jpg\", \"password\" : \"12345\", \"followers\" : [ 15, 15 ], \"following\" : [ 20, 20 ], \"id\" : 10, \"email\" : \"john@email.com\", \"username\" : \"user1\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
    	return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();

    }


    /**
     * POST /user/login : Se inicia sesion en el sistema
     * 
     *
     * @param LoginRequest Clase que encapsula username y password
     * @return operacion exitosa (status code 200)
     *         or Nombre de usuario o contrasena no valido (status code 400)
     */
    @Operation(
        operationId = "loginUser",
        summary = "Se inicia sesion en el sistema",
        description = "",
        tags = { "user" },
        responses = {
            @ApiResponse(responseCode = "200", description = "operacion exitosa", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))
            }),
            @ApiResponse(responseCode = "400", description = "Nombre de usuario o contrasena no valido")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/user/login",
        produces = { "application/json" }
    )
    
    default ResponseEntity<User> loginUser(@RequestBody @Valid LoginRequest loginRequest) {
    	return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /user/logout : Se cierra sesion en el usuario actual
     * 
     *
     * @return operacion exitosa (status code 200)
     */
    @Operation(
        operationId = "logoutUser",
        summary = "Se cierra sesion en el usuario actual",
        description = "",
        tags = { "user" },
        responses = {
            @ApiResponse(responseCode = "default", description = "operacion exitosa")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/user/logout"
    )
    
    default RedirectView logoutUser(HttpSession session
        
    ) {
        return null;

    }

    
    //-------------------------------------------------------------------------------------------------------------

    /**
     * PUT /user/{username} : Actualizar usuario
     * Solo puede utilizarse si el usuario ha iniciado sesion.
     *
     * @param username el nombre del usuario a modificar (required)
     * @param user Modifica el usuario en la aplicacion (optional)
     * @return operacion exitosa (status code 200)
     *         or Invalid username supplied (status code 400)
     *         or User not found (status code 404)
     */
    @Operation(
        operationId = "updateUser",
        summary = "Actualizar usuario",
        description = "Solo puede utilizarse si el usuario ha iniciado sesion.",
        tags = { "user" },
        responses = {
            @ApiResponse(responseCode = "200", description = "operacion exitosa"),
            @ApiResponse(responseCode = "400", description = "Invalid username supplied"),
            @ApiResponse(responseCode = "404", description = "User not found")
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/user/{username}",
        consumes = { "application/json" }
    )
    
    default ResponseEntity<User> updateUser( @Parameter(name = "username", description = "Nombre de usuario", required = true) @PathVariable String username,
    		@Parameter(name = "User", description = "Modifica el usuario en la aplicacion") @Valid @RequestBody(required = true) User user
    ) {
    	return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
    }


    
    /**
     * GET /user/{username}/history : Obtiene el historial de videos de un usuario
     * Devuelve la lista de IDs de videos que el usuario ha visto.
     *
     * @param username El nombre del usuario (required)
     * @return Lista de IDs de videos vistos (status code 200)
     *         or Invalid username supplied (status code 400)
     *         or User not found (status code 404)
     */
    @Operation(
        operationId = "getUserVideoHistory",
        summary = "Obtiene el historial de videos de un usuario",
        description = "Devuelve la lista de IDs de videos que el usuario ha visto.",
        tags = { "user" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Operación exitosa"),
            @ApiResponse(responseCode = "400", description = "Invalid username supplied"),
            @ApiResponse(responseCode = "404", description = "User not found")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/user/{username}/history",
        produces = { "application/json" }
    )
    default ResponseEntity<List<Video>> getUserVideoHistory(
        @Parameter(name = "username", description = "Nombre del usuario", required = true)
        @PathVariable String username
    ) {
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
    }
    
    /**
     * GET /user/{username}/following : Obtiene la lista de usuarios seguidos por un usuario
     * Devuelve la lista de IDs de usuarios que el usuario está siguiendo.
     *
     * @param username El nombre del usuario (required)
     * @return Lista de IDs de usuarios seguidos (status code 200)
     *         or Invalid username supplied (status code 400)
     *         or User not found (status code 404)
     */
    @Operation(
        operationId = "getUserFollowing",
        summary = "Obtiene la lista de usuarios seguidos por un usuario",
        description = "Devuelve la lista de IDs de usuarios que el usuario está siguiendo.",
        tags = { "user" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Operación exitosa"),
            @ApiResponse(responseCode = "400", description = "Invalid username supplied"),
            @ApiResponse(responseCode = "404", description = "User not found")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/user/{username}/following",
        produces = { "application/json" }
    )
    default ResponseEntity<List<Long>> getUserFollowing(
        @Parameter(name = "username", description = "Nombre del usuario", required = true)
        @PathVariable String username
    ) {
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
    }
    
    /**
     * GET /user/list : Obtener lista de usuarios
     * Solo se puede hacer si el usuario ha iniciado sesion.
     *
     * @return operacion exitosa (status code 200)
     *         or Invalid username supplied (status code 400)
     *         or User not found (status code 404)
     */
    @Operation(
        operationId = "getUserList",
        summary = "Obtener lista usuarios",
        tags = { "user" },
        responses = {
            @ApiResponse(responseCode = "200", description = "operacion exitosa"),
            @ApiResponse(responseCode = "400", description = "Invalid username supplied"),
            @ApiResponse(responseCode = "404", description = "User not found")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/user/list"
    )
    
    default ResponseEntity<List<User>> getUserList() {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }
    
    /**
     * GET /user/{userId}/isFollowing/{profileUsername} : Comprobar si un usuario está siguiendo a otro
     * Solo se puede hacer si el usuario ha iniciado sesion.
     *
     * @return operacion exitosa (status code 200)
     *         or Invalid username supplied (status code 400)
     *         or User not found (status code 404)
     */
    @Operation(
        operationId = "isFollowing",
        summary = "Comprobar si un usuario está siguiendo a otro",
        tags = { "user" },
        responses = {
            @ApiResponse(responseCode = "200", description = "operacion exitosa"),
            @ApiResponse(responseCode = "400", description = "Invalid username supplied"),
            @ApiResponse(responseCode = "404", description = "User not found")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/user/{userId}/isFollowing/{profileUsername}"
    )
    
    default ResponseEntity<Boolean> isFollowing(
            @PathVariable Long userId,
            @PathVariable String profileUsername) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }
    
    /**
     * POST /user/follow : Sigue a un usuario
     * Solo se puede hacer si el usuario ha iniciado sesion.
     *
     * @return operacion exitosa (status code 200)
     *         or Invalid username supplied (status code 400)
     *         or User not found (status code 404)
     */
    @Operation(
        operationId = "followUser",
        summary = "Sigue a un usuario",
        tags = { "user" },
        responses = {
            @ApiResponse(responseCode = "200", description = "operacion exitosa"),
            @ApiResponse(responseCode = "400", description = "Invalid username supplied"),
            @ApiResponse(responseCode = "404", description = "User not found")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/user/follow"
    )
    
    default ResponseEntity<Void> followUser(@RequestBody Map<String, Object> request) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }
    
    /**
     * POST /user/unfollow : Deja de seguir a un usuario
     * Solo se puede hacer si el usuario ha iniciado sesion.
     *
     * @return operacion exitosa (status code 200)
     *         or Invalid username supplied (status code 400)
     *         or User not found (status code 404)
     */
    @Operation(
        operationId = "unfollowUser",
        summary = "Deja de seguir a un usuario",
        tags = { "user" },
        responses = {
            @ApiResponse(responseCode = "200", description = "operacion exitosa"),
            @ApiResponse(responseCode = "400", description = "Invalid username supplied"),
            @ApiResponse(responseCode = "404", description = "User not found")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/user/unfollow"
    )
    
    default ResponseEntity<Void> unfollowUser(@RequestBody Map<String, Object> request) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }
    
    /**
     * GET /user/id/{userid} : Obtiene un User por su id
     * Solo se puede hacer si el usuario ha iniciado sesion.
     *
     * @return operacion exitosa (status code 200)
     *         or Invalid username supplied (status code 400)
     *         or User not found (status code 404)
     */
    @Operation(
        operationId = "getUserById",
        summary = "Obtiene un User por su id",
        tags = { "user" },
        responses = {
            @ApiResponse(responseCode = "200", description = "operacion exitosa"),
            @ApiResponse(responseCode = "400", description = "Invalid username supplied"),
            @ApiResponse(responseCode = "404", description = "User not found")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/user/id/{userid}"
    )
    
    default ResponseEntity<User> getUserById(@PathVariable Long userid) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }
    
    /**
     * POST /user/view : Añade una visualización al video
     * Solo se puede hacer si el usuario ha iniciado sesion.
     *
     * @return operacion exitosa (status code 200)
     *         or Invalid username supplied (status code 400)
     *         or User not found (status code 404)
     */
    @Operation(
        operationId = "addView",
        summary = "Añade una visualización al video",
        tags = { "user" },
        responses = {
            @ApiResponse(responseCode = "200", description = "operacion exitosa"),
            @ApiResponse(responseCode = "400", description = "Invalid username supplied"),
            @ApiResponse(responseCode = "404", description = "User not found")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/user/view"
    )
    
    default ResponseEntity<Void> addView(@RequestBody Map<String, Long> payload) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }
    
    /**
     * POST /user/like : Añade un like al video
     * Solo se puede hacer si el usuario ha iniciado sesion.
     *
     * @return operacion exitosa (status code 200)
     *         or Invalid username supplied (status code 400)
     *         or User not found (status code 404)
     */
    @Operation(
        operationId = "addLike",
        summary = "Añade un like al video",
        tags = { "user" },
        responses = {
            @ApiResponse(responseCode = "200", description = "operacion exitosa"),
            @ApiResponse(responseCode = "400", description = "Invalid username supplied"),
            @ApiResponse(responseCode = "404", description = "User not found")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/user/like"
    )
    
    default ResponseEntity<Void> addLike(@RequestBody Map<String, Long> payload) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }
    
    /**
     * POST /user/unlike : Añade un like al video
     * Solo se puede hacer si el usuario ha iniciado sesion.
     *
     * @return operacion exitosa (status code 200)
     *         or Invalid username supplied (status code 400)
     *         or User not found (status code 404)
     */
    @Operation(
        operationId = "addUnlike",
        summary = "Quita un like al video",
        tags = { "user" },
        responses = {
            @ApiResponse(responseCode = "200", description = "operacion exitosa"),
            @ApiResponse(responseCode = "400", description = "Invalid username supplied"),
            @ApiResponse(responseCode = "404", description = "User not found")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/user/unlike"
    )
    
    default ResponseEntity<Void> addUnlike(@RequestBody Map<String, Long> payload) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }
    
    /**
     * POST /user/deleteHistory : Elimina un video del historial de todos los usuarios.
     *
     * @return operación exitosa (status code 200)
     *         or Error en la conexión a la base de datos (status code 500)
     */
    @Operation(
        operationId = "deleteHistory",
        summary = "Elimina un video del historial de todos los usuarios.",
        tags = { "user" },
        responses = {
            @ApiResponse(responseCode = "200", description = "operación exitosa"),
            @ApiResponse(responseCode = "500", description = "Error en la conexión a la base de datos")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/user/deleteHistory"
    )
    default ResponseEntity<Void> deleteHistory(@RequestBody Long videoId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * GET /user/{username}/followingProfiles : Obtiene la lista de perfiles seguidos por un usuario.
     *
     * @return Lista de usuarios seguidos (status code 200)
     *         or Sin contenido (status code 204)
     *         or Error en la conexión a la base de datos (status code 500)
     */
    @Operation(
        operationId = "getFollowingUsers",
        summary = "Obtiene la lista de perfiles seguidos por un usuario.",
        tags = { "user" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Lista de usuarios seguidos"),
            @ApiResponse(responseCode = "204", description = "Sin contenido"),
            @ApiResponse(responseCode = "500", description = "Error en la conexión a la base de datos")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/user/{username}/followingProfiles"
    )
    default ResponseEntity<List<User>> getFollowingUsers(@PathVariable String username) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * GET /user/{username}/notfollowingProfiles : Obtiene la lista de perfiles no seguidos por un usuario.
     *
     * @return Lista de usuarios no seguidos (status code 200)
     *         or Sin contenido (status code 204)
     *         or Error en la conexión a la base de datos (status code 500)
     */
    @Operation(
        operationId = "getNotFollowingUsers",
        summary = "Obtiene la lista de perfiles no seguidos por un usuario.",
        tags = { "user" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Lista de usuarios no seguidos"),
            @ApiResponse(responseCode = "204", description = "Sin contenido"),
            @ApiResponse(responseCode = "500", description = "Error en la conexión a la base de datos")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/user/{username}/notfollowingProfiles"
    )
    default ResponseEntity<List<User>> getNotFollowingUsers(@PathVariable String username) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}