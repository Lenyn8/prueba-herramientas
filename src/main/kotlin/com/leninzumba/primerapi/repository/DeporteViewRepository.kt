package com.leninzumba.primerapi.repository

import com.leninzumba.primerapi.model.DeporteView
import org.springframework.data.jpa.repository.JpaRepository

interface DeporteViewRepository: JpaRepository<DeporteView, String> {
}