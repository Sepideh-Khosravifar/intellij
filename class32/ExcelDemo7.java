package src.com.syntax.class32;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelDemo7 {

    public static void main(String[] args) throws IOException {

        String path="C:\\Users\\User\\OneDrive\\Desktop\\Book1.xlsx";

        FileInputStream fileInputStream = new FileInputStream(path);

        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);

        Sheet sheet = xssfWorkbook.getSheet("sheet1");

        Row row = sheet.createRow(6);

        row.createCell(0).setCellValue("Jaleh");

        row.createCell(1).setCellValue("Khosravi");

        row.createCell(2).setCellValue("55");

        row.createCell(3).setCellValue("Tehran");

        FileOutputStream fileOutputStream = new FileOutputStream (path);

        xssfWorkbook.write(fileOutputStream);

        }
    }
