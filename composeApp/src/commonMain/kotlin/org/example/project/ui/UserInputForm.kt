package org.example.project.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.ExposedDropdownMenuBox
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun UserInputForm() {
    val users = remember { mutableStateListOf<User>() }
    var solicitante by remember { mutableStateOf("") }
    var setor by remember { mutableStateOf("") }
    var entidade by remember { mutableStateOf("") }
    var tipoProcesso by remember { mutableStateOf("") }
    var numeroProcesso by remember { mutableStateOf("") }
    var numeroReferencia by remember { mutableStateOf("") }
    var expectativaResposta by remember { mutableStateOf("") }
    var prioridade by remember { mutableStateOf("") }
    var justificativa by remember { mutableStateOf("") }
    var descricacao by remember { mutableStateOf("") }

    LazyColumn (modifier = Modifier.padding(16.dp)) {

        item {
            var expanded by remember { mutableStateOf(false) }
            var setor by remember { mutableStateOf("") }

            // Lista de setores disponíveis
            val setores = listOf("Setor 1", "Setor 2", "Setor 3", "Setor 4")

            ExposedDropdownMenuBox(
                expanded = expanded,
                onExpandedChange = { expanded = !expanded }
            ) {
                // TextField para mostrar o setor selecionado
                OutlinedTextField(
                    value = setor,
                    onValueChange = { setor = it },
                    label = { Text("Setor") },
                    modifier = Modifier
                        .padding(bottom = 8.dp),
                    readOnly = true // Impede que o usuário digite no campo
                )

                // Menu suspenso com os setores disponíveis
                ExposedDropdownMenu(
                    expanded = expanded,
                    onDismissRequest = { expanded = false }
                ) {
                    setores.forEach { setorOption ->
                        DropdownMenuItem(onClick = {
                            setor = setorOption
                            expanded = false // Fecha o menu após a seleção
                        }) {
                            Text(text = setorOption)
                        }
                    }
                }
            }
        }
        
        item {
            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                OutlinedTextField(
                    value = solicitante,
                    onValueChange = { solicitante = it },
                    label = { Text("Solicitante") },
                    modifier = Modifier.weight(1f).padding(bottom = 8.dp)
                )
                Spacer(modifier = Modifier.width(6.dp))
                OutlinedTextField(
                    value = setor,
                    onValueChange = { setor = it },
                    label = { Text("Setor") },
                    modifier = Modifier.weight(1f).padding(bottom = 8.dp)
                )
            }
            

        }

        item {
            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                OutlinedTextField(
                    value = entidade,
                    onValueChange = { entidade = it },
                    label = { Text("Entidade") },
                    modifier = Modifier.weight(1f).padding(bottom = 8.dp)
                )
                Spacer(modifier = Modifier.width(6.dp))
                OutlinedTextField(
                    value = tipoProcesso,
                    onValueChange = { tipoProcesso = it },
                    label = { Text("Tipo Processo") },
                    modifier = Modifier.weight(1f).padding(bottom = 8.dp)
                )
            }
        }

        item {
            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                OutlinedTextField(
                    value = numeroProcesso,
                    onValueChange = { numeroProcesso = it },
                    label = { Text("Número do processo") },
                    modifier = Modifier.weight(1f).padding(bottom = 8.dp)
                )
                Spacer(modifier = Modifier.width(6.dp))
                OutlinedTextField(
                    value = numeroReferencia,
                    onValueChange = { numeroReferencia = it },
                    label = { Text("Número de Referência") },
                    modifier = Modifier.weight(1f).padding(bottom = 8.dp)
                )
            }
        }

        item {
            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                OutlinedTextField(
                    value = expectativaResposta,
                    onValueChange = { expectativaResposta = it },
                    label = { Text("Expectativa de resposta") },
                    modifier = Modifier.weight(1f).padding(bottom = 8.dp)
                )
                Spacer(modifier = Modifier.width(6.dp))
                OutlinedTextField(
                    value = prioridade,
                    onValueChange = { prioridade = it },
                    label = { Text("Prioridade") },
                    modifier = Modifier.weight(1f).padding(bottom = 8.dp)
                )
            }
        }

        item {
            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                OutlinedTextField(
                    value = justificativa,
                    onValueChange = { justificativa = it },
                    label = { Text("Justificativa Prioridade") },
                    modifier = Modifier.fillMaxWidth().padding(bottom = 8.dp)
                )
            }
        }


        item {
            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                OutlinedTextField(
                    value = descricacao,
                    minLines = 6,
                    onValueChange = { descricacao = it },
                    label = { Text("Descrição") },
                    modifier = Modifier.fillMaxWidth().padding(bottom = 8.dp)
                )
            }
        }

        (item {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ){
                Button(
                    onClick = {
                    },
                    modifier = Modifier.fillMaxWidth(0.25f),
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = Color.Blue
                    )
                ) {
                    Text(text = "Cadastrar Pat", color = Color.White)
                }
            }
        })

    }
}
