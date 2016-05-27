package com.mvc.board;

import org.apache.ibatis.executor.ReuseExecutor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mvc.board.DTO.BoardDTO;
import com.mvc.board.service.BoardService;


@Controller
@RequestMapping("/board/*")
public class BoardController {
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Autowired
	private BoardService service;
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public void registerGET()
	{
		logger.info("register get.....");
		
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String registerPOST(BoardDTO dto , RedirectAttributes rttr) throws Exception
	{
		logger.info("register post......");
		logger.info(dto.toString());
		service.create(dto); 
		rttr.addFlashAttribute("result", "success");
		
		return "redirect:/board/listAll";
	}
	
	@RequestMapping(value = "/listAll", method = RequestMethod.GET)
	public void listAll(Model model)throws Exception
	{
		logger.info("show all list... ... ...");
		model.addAttribute("list", service.listAll() );
	}
	
	@RequestMapping(value = "/read", method = RequestMethod.GET)
	public void read(@RequestParam("bno") int bno, Model model) throws Exception
	{
		model.addAttribute(service.read(bno));
	}
	
	@RequestMapping(value = "/remove", method = RequestMethod.POST)
	public String remove(@RequestParam("bno") int bno, RedirectAttributes rttr) throws Exception
	{
		service.delete(bno);
		
		rttr.addFlashAttribute("msg", "SUCCESS");
		
		return "redirect:/board/listAll";
	}
	
	@RequestMapping(value = "/modify", method = RequestMethod.GET)
	public void modifyGet(int bno, Model model)throws Exception
	{
		BoardDTO dto = service.read(bno);
		model.addAttribute(dto);
	}
	
	@RequestMapping(value = "/modify", method = RequestMethod.POST)
	public String modifyPost(BoardDTO dto, RedirectAttributes rttr)throws Exception
	{
		logger.info("modify post");
		
		service.update(dto);
		
		rttr.addFlashAttribute("msg", "SUCCESS");
		
		return "redirect:/board/listAll";
	}
	
	
}
