import java.util.ArrayList;
import java.util.List;

import dto.OrderDetailDto;
import dto.OrderDto;
import service.OrderService;

public class App {
    public static void main(String[] args) throws Exception {

        OrderService orderService = new OrderService();

        OrderDto orderDto = new OrderDto();
        orderDto.setCustId("C001");
        orderDto.setOrderId("D069");

        List<OrderDetailDto> detailDtos = new ArrayList<>();
        detailDtos.add(new OrderDetailDto("P001", 10, 0.0));
        detailDtos.add(new OrderDetailDto("P010", 5, 0.0));

        orderDto.setOrderDetailDtos(detailDtos);

        String resp =orderService.placeOrder(orderDto);
        System.out.println(resp);
    }
}