package com.educandoweb.course.entities.enums;

public enum OrderStatus {
	
	WAITING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(5);
	/* caso prefira, atribuir valores p. ex. WAITING_PAYMENT(1), PAID(2), SHIPPED(3)...
	 necessitando implementar atributo code e construtor e um método para retornar enum pelo code
	 caso prefira simplesmente usar uma Annotation na classe Order, acima do atributo orderStatus [que seria @Enumerated(EnumType.STRING)]
	 isso faria com que o nome do Enum aparecesse lá na requisição, não números
	 */
	 
	 private int code;
	 private OrderStatus(int code) {
	      this.code = code;
	 }
	 
	 public int getCode() {
	      return code;
	 }
	 
	 public static OrderStatus valueOf(int code) {
	   for (OrderStatus value : OrderStatus.values()) {
	      if (value.getCode() == code) {
	             return value;
	      }
	   }
	   throw new IllegalArgumentException("Invalid OrderStatus code");
	 }

}
