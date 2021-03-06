package com.example.organizze.database.dao

import com.example.organizze.model.FinancialMovement

interface FinancialMovementDAO {

    fun saveMovement(financialMovement: FinancialMovement) : Long

    fun getMovements(yearMonth: String, notifyAdapterRunnable: Runnable?)

    fun deleteMovement(financialMovement: FinancialMovement) : Boolean

    fun updateMovement(old: FinancialMovement, new: FinancialMovement)
}