package fr.univ_amu.iut.exercice3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ConvertisseurDeNombreRomainTest {

    private ConvertisseurDeNombreRomain convertisseurDeNombreRomain;

    @BeforeEach
    public void setUp() {
        convertisseurDeNombreRomain = new ConvertisseurDeNombreRomain();
    }

    @Test
    public void leChiffreRomainIDevraitDonner1() {
        int nombre = convertisseurDeNombreRomain.enNombreArabe("I");
        assertEquals(1, nombre);
    }

    @Test
    public void leChiffreRomainVDevraitDonner5() {
        int nombre = convertisseurDeNombreRomain.enNombreArabe("V");
        assertEquals(5, nombre);
    }

    @Test
    public void leChiffreRomainXDevraitDonner10() {
        int nombre = convertisseurDeNombreRomain.enNombreArabe("X");
        assertEquals(10, nombre);
    }

    @Test
    public void leChiffreRomainZDevraitDonnerUneException() {
        assertThrows(IllegalArgumentException.class,
                () ->convertisseurDeNombreRomain.enNombreArabe("Z"));
    }

    @Test
    public void leChiffreRomainIIDevraitDonner2() {
        int nombre = convertisseurDeNombreRomain.enNombreArabe("II");
        assertEquals(2, nombre);
    }

    @Test
    public void leChiffreRomainIIIDevraitDonner3() {
        int nombre = convertisseurDeNombreRomain.enNombreArabe("III");
        assertEquals(3, nombre);
    }

    @Test
    public void leChiffreRomainVIDevraitDonner6() {
        int nombre = convertisseurDeNombreRomain.enNombreArabe("VI");
        assertEquals(6, nombre);
    }

    @Test
    public void leChiffreRomainIVDevraitDonner4() {
        int nombre = convertisseurDeNombreRomain.enNombreArabe("IV");
        assertEquals(4, nombre);
    }

    @Test
    public void leChiffreRomainIXDevraitDonner9() {
        int nombre = convertisseurDeNombreRomain.enNombreArabe("IX");
        assertEquals(9, nombre);
    }

    @Test
    public void leChiffreRomainLDevraitDonner50() {
        int nombre = convertisseurDeNombreRomain.enNombreArabe("L");
        assertEquals(50, nombre);
    }

    @Test
    public void leChiffreRomainXLDevraitDonner40() {
        int nombre = convertisseurDeNombreRomain.enNombreArabe("XL");
        assertEquals(40, nombre);
    }

    @Test
    public void leChiffreRomainXLIXDevraitDonner49() {
        int nombre = convertisseurDeNombreRomain.enNombreArabe("XLIX");
        assertEquals(49, nombre);
    }

    @Test
    public void leChiffreRomainXCIXDevraitDonner99() {
        int nombre = convertisseurDeNombreRomain.enNombreArabe("XCIX");
        assertEquals(99, nombre);
    }

    @Test
    public void leChiffreRomainCCCXLVIDevraitDonner346() {
        int nombre = convertisseurDeNombreRomain.enNombreArabe("CCCXLVI");
        assertEquals(346, nombre);
    }

    @Test
    public void leChiffreRomainCCCXCIXDevraitDonner399() {
        int nombre = convertisseurDeNombreRomain.enNombreArabe("CCCXCIX");
        assertEquals(399, nombre);
    }

    @Test
    public void leChiffreRomainLXXXDevraitDonner80() {
        int nombre = convertisseurDeNombreRomain.enNombreArabe("LXXX");
        assertEquals(80, nombre);
    }

    @Test
    public void leChiffreRomainLXXXVIIIDevraitDonner88() {
        int nombre = convertisseurDeNombreRomain.enNombreArabe("LXXXVIII");
        assertEquals(88, nombre);
    }

    @Test
    public void leChiffreRomainMMMMDCCCLXXXVIIIDevraitDonner4888() {
        int nombre = convertisseurDeNombreRomain.enNombreArabe("MMMMDCCCLXXXVIII");
        assertEquals(4888, nombre);
    }

    @Test
    public void leChiffreRomainILDevraitDonnerUneException() {
        assertThrows(IllegalArgumentException.class,
                () ->convertisseurDeNombreRomain.enNombreArabe("IL"));
    }

    @Test
    public void leChiffreRomainICDevraitDonnerUneException() {
        assertThrows(IllegalArgumentException.class,
                () ->convertisseurDeNombreRomain.enNombreArabe("IC"));
    }

    @Test
    public void leChiffreRomainIDDevraitDonnerUneException() {
        assertThrows(IllegalArgumentException.class,
                () ->convertisseurDeNombreRomain.enNombreArabe("ID"));
    }

    @Test
    public void leChiffreRomainIMDevraitDonnerUneException() {
        assertThrows(IllegalArgumentException.class,
                () ->convertisseurDeNombreRomain.enNombreArabe("IM"));
    }

    @Test
    public void leChiffreRomainVXDevraitDonnerUneException() {
        assertThrows(IllegalArgumentException.class,
                () ->convertisseurDeNombreRomain.enNombreArabe("VX"));
    }

    @Test
    public void leChiffreRomainXDDevraitDonnerUneException() {
        assertThrows(IllegalArgumentException.class,
                () ->convertisseurDeNombreRomain.enNombreArabe("XD"));
    }

    @Test
    public void leChiffreRomainXMDevraitDonnerUneException() {
        assertThrows(IllegalArgumentException.class,
                () ->convertisseurDeNombreRomain.enNombreArabe("XM"));
    }

}
