package br.edu.utfpr.trabalhofinal.data

import java.math.BigDecimal
import java.time.LocalDate

data class Lancamento(
    val id: Int = 0,
    val descricao: String = "",
    val data: LocalDate = LocalDate.now(),
    val valor: BigDecimal = BigDecimal.ZERO,
    val paga: Boolean = false,
    val tipo: TipoLancamentoEnum = TipoLancamentoEnum.DESPESA
){
    val valorFinal get(): BigDecimal = if(tipo == TipoLancamentoEnum.RECEITA) valor else valor.negate()
    val pagoTxt get(): String = if (paga) "pago" else "pendente"
}