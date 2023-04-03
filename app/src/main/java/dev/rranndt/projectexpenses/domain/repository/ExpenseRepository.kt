package dev.rranndt.projectexpenses.domain.repository

import dev.rranndt.projectexpenses.domain.model.Category
import dev.rranndt.projectexpenses.domain.model.Expense
import kotlinx.coroutines.flow.Flow

interface ExpenseRepository {
    suspend fun insertCategory(category: Category)
    suspend fun deleteCategoryBy(id: Int)
    fun getCategories(): Flow<List<Category>>
    suspend fun insertExpense(expense: Expense)
    fun getExpenses(): Flow<List<Expense>>
}