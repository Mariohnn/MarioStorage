#include <stdio.h>
#include <stdlib.h>
#include <omp.h>

int** create_matrix(int rows) {
    /* retorna ponteiro para vetor de ponteiros utilizar dois mallocs para alocar uma matriz quadrada*/
    return mat;
}

void init_matriz(int **M, int v, int N){
    /* inicializa os valores da matriz com um número inteiro v */
}

void print_matriz(int **M){
    /* função util para verificar se os calculos estão corretos */
    for (int i=0; i<10; i++) {
        for (int j=0; j<10; j++)
            printf("%d ", M[i][j]);
        printf("\n");
    }
}

int soma_acumulada(int **Z, int N){
    int soma = 0;
    /* função que soma todos os valores da matriz e atualiza a variável soma */
    return soma;
}

void mat_mul_dist(int** X, int** Y, int** Z, int N) {
    int i,j,k; // contadores dos loops
    // inserir aqui q diretiva do OpenMP com as variáveis compartilhadas (X,Y,Z,N) e variáveis particulares (i,j,k)  
    {
        #pragma omp for schedule(static)
        /* inserir aqui o código para multiplicar matrizes */
    }
}

int main(void) {
    int N = ?; // deixar fixo respeitando o valor do enunciado da atividade
    int thread_num = omp_get_max_threads();
    printf("Quantidade de processadores disponíveis: %d\n", omp_get_num_procs());
    printf("Quantidade de threads disponíveis: %d\n", thread_num);

    int **X = create_matrix(N);
    int **Y = create_matrix(N);
    int **Z = create_matrix(N);

    init_matriz(X, 2, N);
    init_matriz(Y, 1, N);

    double wtime1 = omp_get_wtime();
    // Multiplicação distribuída
    wtime1 = omp_get_wtime() - wtime1;
    printf("Tempo distribuido: %g\n", wtime1);

    double wtime2 = omp_get_wtime();
    // soma acumulada
    wtime2 = omp_get_wtime() - wtime2;
    printf("Tempo sequencial: %g\n", wtime2);
    
    printf("Tempo total: %g\n", // tempo total (dist + soma));
    printf("\n");
    return 0;

