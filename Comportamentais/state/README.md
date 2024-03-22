## O PROBLEMA

Considere um sistema de delivery de comida, onde os pedidos passam por diferentes status, como “aguardando confirmação do restaurante”, "em preparo", “pronto para entrega“, “saiu para entrega”, e “entregue". Qualquer semelhança com o ifood é mera coincidência. Cada estado possui diferentes ações associadas, como notificar o cliente sobre o status do pedido, chamar o entregador, receber o pagamento, e outros.

Proponha uma solução utilizando o padrão de design State para modelar os diferentes estados de um pedido como classes separadas. As operações que permitem mudar de estado devem ser operações disponíveis numa classe de contexto, que nesse caso, seria uma Central de Pedidos.

Crie um diagrama de estados representando a máquina de estados finita que você construiu. Por fim, para testar o seu sistema, crie em uma classe Cliente um objeto da Central de Pedidos e exercite todos os estados do seu sistema. Acrescente no código comentários indicando a mudança de estado.