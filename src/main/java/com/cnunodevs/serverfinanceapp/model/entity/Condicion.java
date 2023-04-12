package com.cnunodevs.serverfinanceapp.model.entity;

import java.math.BigDecimal;
import java.util.UUID;

import com.cnunodevs.serverfinanceapp.model.entity.enums.Expresion;
import com.cnunodevs.serverfinanceapp.model.entity.enums.TipoImporte;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="ahorros")
public class Condicion {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(length = 50)
    private Expresion expresion;

    private BigDecimal importe;

    @Column(length = 25)
    private TipoImporte tipoImporte;

    private Boolean enabled;

}