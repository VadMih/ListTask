package ru.listtask.app;

import java.awt.EventQueue;
import ru.listtask.window.AppWindow;

/* Version 0.05
 * Программа создает список задач в виде динамического массива LinkedList из классов MyTask и
 * сортирует их по выбранному параметру - приоритет или влияние.
 * Все данные о задачах считываются из файла. Пробная версия для работы с интерфейсом GUI.
 * Приоритет варьируется от 1 до 4 и основывается на матрице Эйзенхауэра, в которой значения
 * принимают следующий вид:
 * 1 - срочные и важные дела;
 * 2 - не срочные и важные дела;
 * 3 - срочные и неважные дела;
 * 4 - не срочные и неважные дела.
 * Вторая часть сортировки предполагает три значения от 1 до 3. (К сожалению не нашел
 * источника и названия этого процесса).
 * Она подразумевают следующее:
 * 1 - те дела и занятия, полностью зависящие от человека;
 * 2 - дела и занятия, частично зависящие от человека;
 * 3 - все то, что беспокоит, но при этом не зависит от человека.*/

public class AppListTask {
	//static MyListTask listTask;
    
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
                        @Override
			public void run() {
				try {
					AppWindow app = new AppWindow();
					app.setVisible(true);
				} catch (Exception e) {
					System.out.println("Error " + e);
				}
			}
		});
	}
}