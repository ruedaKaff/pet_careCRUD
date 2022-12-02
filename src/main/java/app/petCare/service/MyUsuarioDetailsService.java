package app.petCare.service;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import app.petCare.entity.Usuario;
import app.petCare.repository.UsuarioRepository;

import java.util.Collection;

public class MyUsuarioDetailsService implements UserDetails {
    private final Usuario usuario;
    private final UsuarioRepository repository;

    public MyUsuarioDetailsService(Usuario usuario, UsuarioRepository repository) {
        this.usuario = usuario;
        this.repository = repository;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return usuario.getPassword();
    }

    @Override
    public String getUsername() {
        return usuario.getUsername();
    }

    public Usuario getUsuario() { return usuario; }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
