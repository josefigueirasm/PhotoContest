package com.figueiras.photocontest.backend.model.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import java.time.LocalDateTime;

@Entity
public class UsuarioParticipaConcurso {


    private UsuarioParticipaConcursoPK usuarioParticipaConcursoPK = new UsuarioParticipaConcursoPK();


    private Usuario usuario;

    private Concurso concurso;
    private RolUsuario rolUsuario;
    private LocalDateTime fechaInicioParticipacion;

    @EmbeddedId
    public UsuarioParticipaConcursoPK getUsuarioParticipaConcursoPK() {
        return usuarioParticipaConcursoPK;
    }

    public void setUsuarioParticipaConcursoPK(UsuarioParticipaConcursoPK usuarioParticipaConcursoPK) {
        this.usuarioParticipaConcursoPK = usuarioParticipaConcursoPK;
    }

    @ManyToOne
    @MapsId("idUsuaio")
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @ManyToOne
    @MapsId("idConcurso")
    public Concurso getConcurso() {
        return concurso;
    }

    public void setConcurso(Concurso concurso) {
        this.concurso = concurso;
    }

    public RolUsuario getRolUsuario() {
        return rolUsuario;
    }

    public void setRolUsuario(RolUsuario rolUsuario) {
        this.rolUsuario = rolUsuario;
    }

    public LocalDateTime getFechaInicioParticipacion() {
        return fechaInicioParticipacion;
    }

    public void setFechaInicioParticipacion(LocalDateTime fechaInicioParticipacion) {
        this.fechaInicioParticipacion = fechaInicioParticipacion;
    }
}