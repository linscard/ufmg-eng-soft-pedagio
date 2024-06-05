# ufmg-eng-soft-pedagio
O projeto visa automatizar a cobrança de pedágios para veículos, eliminando a necessidade de parada nas estações de pedágio. Utilizando comunicação rodoviária e computadores de bordo, pretende-se facilitar a cobrança, mesmo para veículos sem essa tecnologia.
A implementação incluirá a integração com sistemas de smart-card, permitindo que motoristas comprem cartões para pagamento. As estações de pedágio serão automatizadas, com monitoramento remoto e capacidade de identificação de veículos por meio de câmeras.
O sistema será projetado para integração com outros sistemas, especialmente aqueles relacionados ao licenciamento de veículos.

Descrição dos Cenários de Casos de Uso

Cadastrar Usuário:
Nome do Cenário: Cadastrar Usuário
Ator: Usuário
Fluxo Normal:
O sistema exibe o formulário de cadastro de usuário.
O usuário preenche o formulário com suas informações pessoais.
O usuário confirma o cadastro.
O sistema valida as informações e registra o novo usuário.
Pós-condição: O usuário é registrado com sucesso no sistema.

Cadastrar Veículo:
Nome do Cenário: Cadastrar Veículo
Ator: Usuário
Pré-condição: O usuário está autenticado no sistema.
Fluxo Normal:
O sistema exibe o formulário de cadastro de veículo.
O usuário preenche o formulário com os detalhes do veículo.
O usuário confirma o cadastro.
O sistema associa o veículo à conta do usuário.
Pós-condição: O veículo é registrado e associado à conta do usuário.

Passar pelo Pedágio:
Nome do Cenário: Passar pelo Pedágio
Ator: Usuário
Pré-condição: O veículo está equipado com um smart card válido.
Fluxo Normal:
O sistema identifica o veículo por meio do smart card enquanto ele se aproxima da estação de pedágio.
O sistema calcula a taxa de pedágio com base nas características do veículo e nas tarifas vigentes.
O usuário confirma o pagamento automaticamente, utilizando o smart card.
O sistema registra a passagem do veículo e o pagamento.
Fluxo Alternativo (Smart Card Inválido):
O sistema identifica que o smart card do veículo é inválido.
O sistema notifica o usuário sobre o problema e solicita uma ação.
O usuário seleciona a opção de self checkout.
O sistema registra o self checkout e emite um recibo para o usuário.
Pós-condição: A passagem pelo pedágio é registrada, seja pelo pagamento automático com o smart card válido ou pelo self checkout, conforme apropriado.

Gerenciar Tarifas:
Nome do Cenário: Gerenciar Tarifas
Ator: Administrador
Pré-condição: O administrador está autenticado no sistema.
Fluxo Normal:
O sistema exibe a lista de tarifas atuais.
O administrador seleciona uma tarifa existente para edição ou adiciona uma nova tarifa.
O administrador realiza as alterações desejadas.
O administrador confirma as alterações.
O sistema atualiza as informações das tarifas.
Pós-condição: As tarifas são gerenciadas conforme as alterações realizadas pelo administrador.

Gerar Relatórios:
Nome do Cenário: Gerar Relatórios
Ator: Administrador
Pré-condição: O administrador está autenticado no sistema.
Fluxo Normal:
O sistema exibe opções para selecionar o tipo de relatório e os parâmetros de filtragem.
O administrador seleciona os parâmetros desejados.
O sistema gera o relatório com base nos parâmetros selecionados.
O sistema exibe o relatório para o administrador visualizar ou baixar.
Pós-condição: O relatório é gerado e disponibilizado para o administrador conforme os parâmetros selecionados.


