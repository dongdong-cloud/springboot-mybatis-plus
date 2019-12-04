package fun.imcoder.cloud.base;

import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

public class BaseController<M extends BaseModel,S extends IService> {

    @Resource
    public IService<M> service;

    @GetMapping("/all")
    public List<M> findAll(){
        return service.list();
    }

    @PostMapping("/save")
    public boolean save(@RequestBody M m){
        return service.saveOrUpdate(m);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable Serializable id){
        return service.removeById(id);
    }

}
