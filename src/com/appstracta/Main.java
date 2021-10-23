package com.appstracta;

import com.appstracta.bean.City;
import com.appstracta.bean.Country;
import com.appstracta.enums.Status;
import com.appstracta.excepcion.MiExcepcion;

import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try (sc) {
			List<Country> paises = cargaPaises();
			List<City> ciudades = new ArrayList<>();

			if (paises.isEmpty()) {
				throw new MiExcepcion("La lista de paises esta vacía");
			}

			System.out.println("¿Cuantas ciudades deseas ingresar? :: ");
			int cantidad = sc.nextInt();

			for (int i = 1; i <= cantidad; i++) {
				City ciudad = new City();

				System.out.println("Introduce el id de la ciudad :: ");
				ciudad.setId(sc.nextInt());
				System.out.println("Introduce el nombre de la ciuad :: ");
				ciudad.setCity(sc.next());
				System.out.println("Introduce el id de pais a que pertenece :: ");
				ciudad.setCountry(paises.get(sc.nextInt() - 1));
				ciudad.setStatus(Status.ACTIVE.toString());
				ciudad.setUpdate(new Date());

				ciudades.add(ciudad);
			}

			imprimirCiudades(ciudades);
			System.out.println("¿Qué indice de ciudad quieres imprimir?");
			imprimirCiudades(ciudades, sc.nextInt());
		} catch (InputMismatchException ex) {
			System.out.println("Error de captura desde el teclado ::" + ex.getMessage());
		} catch (IndexOutOfBoundsException ex) {
			System.out.println("El país selecionado no existe :: " + ex.getMessage());
		} catch (MiExcepcion ex) {
			System.out.println("Error personalizado :: " + ex.getMessage());
		}

	}

	public static List<Country> cargaPaises() {
		List<Country> paises = new ArrayList<>();

		paises.add(new Country(1, "Mexico", new Date()));
		paises.add(new Country(2, "España", new Date()));

		return paises;
	}

	private static void imprimirCiudades(List<City> ciudades) {
		ciudades.forEach(System.out::println);
	}

	// Método sobrecargado
	private static void imprimirCiudades(List<City> ciudades, int posicion) throws MiExcepcion {
		try {
			City ciudad = ciudades.get(posicion);

			System.out.println("Id :: " + ciudad.getId());
			System.out.println("Nombre :: " + ciudad.getCity());
			System.out.println("Estatus :: " + ciudad.getStatus());
			System.out.println("Fecha :: " + ciudad.getUpdate());
			System.out.println("País :: " + ciudad.getCountry());
		} catch (IndexOutOfBoundsException ex) {
			throw new MiExcepcion("El indice de la ciudad no se encuentra registrado");
		}
	}

}
