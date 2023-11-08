package ru.sfu.waffflezz.rkis5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Класс, являющейся точкой входа в программу
 */
@SpringBootApplication
public class Rkis5Application {

	/**
	 * Главный метод, запускается java
	 *
	 * @param args аргументы, которые пробрасываются в приложения через командную строку при запуске
	 */
	public static void main(String[] args) {
		SpringApplication.run(Rkis5Application.class, args);
	}
}
