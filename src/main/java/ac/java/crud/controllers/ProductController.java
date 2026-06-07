package ac.java.crud.controllers;

import ac.java.crud.entities.Producto;
import ac.java.crud.repositories.ProductoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductController {

    private final ProductoRepository productoRepository;

    public ProductController(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    @PostMapping
    public void crearProducto(@RequestBody Producto nuevoProducto) {
        productoRepository.save(nuevoProducto);
    }

    @GetMapping
    public List<Producto> listarProductos() {
        return productoRepository.findAll();
    }

    @GetMapping("/{id}")
    public Producto encontrarProducto(@PathVariable Long id) {
        return productoRepository.findById(id)
                .orElse(null);
    }

    @PutMapping("/{id}")
    public void actualizarProducto(@PathVariable Long id, @RequestBody Producto productoActualizado) {
        Producto productoEncontrado = productoRepository.findById(id)
                .orElse(null);

        productoEncontrado.setTitulo(productoActualizado.getTitulo());
        productoEncontrado.setPrecio(productoActualizado.getPrecio());
        productoEncontrado.setStock(productoActualizado.getStock());

        productoRepository.save(productoEncontrado);
    }

    @DeleteMapping("/{id}")
    public void eliminarProducto(@PathVariable Long id) {
        productoRepository.deleteById(id);
    }

}
