def defaultArticle = siteItemService.getSiteItem("/site/articles/2019/05/a-better-way-to-artichokes.xml")
templateModel.currentArticle = (params.id) ? siteItemService.getSiteItem("/site/articles/"+params.id+".xml") : defaultArticle
